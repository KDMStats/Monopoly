package controller;

import logs.LogHandler;
import store.MonopolyStore;
import types.board.ABoardLocation;
import types.board.Board;
import types.board.other.Go;
import types.player.Player;
import utils.DiceUtils;

public class GameController {

	private Board board;

	public void run() {

		MonopolyStore store = MonopolyStore.getInstance();
		board = store.getBoard();

		int turns = 0;
		while (true) {
			if (turns == 10000) {
				LogHandler.getInstance().crash("Game did not end naturally!");
			}

			processPlayerTurn(store.getCurrentPlayer());

			if (gameOver()) {
				return;
			}

			store.nextPlayersTurn();
			turns++;
		}

	}

	private boolean gameOver() {
		return MonopolyStore.getInstance().getActivePlayers().size() == 1;
	}

	private void processPlayerTurn(Player player) {
		if (player.hasLost()) {
			return;
		}

		int dice1Roll = DiceUtils.rollD6();
		int dice2Roll = DiceUtils.rollD6();

		if (player.inJail()) {
			if (dice1Roll == dice2Roll) {
				player.releasedFromJail();
			} else if (player.getJailTurns() >= 2) {
				int lostMoney = player.loseMoney(50);
				board.addFreeParkingMoney(lostMoney);
				player.releasedFromJail();
			} else {
				player.stayedInJail();
				return;
			}
		}

		int doubleCount = 0;
		while (true) {
			if (doubleCount == 2 && dice1Roll == dice2Roll) {
				player.setLocation(board.getLocation(10));
				player.arrested();
			}

			playerMove(player, dice1Roll + dice2Roll);

			if (dice1Roll != dice2Roll) {
				break;
			}
			doubleCount++;

			dice1Roll = DiceUtils.rollD6();
			dice2Roll = DiceUtils.rollD6();
		}

	}

	private void playerMove(Player player, int movement) {

		int boardIndex = (player.getLocation().getIndex() + movement)
				% board.size();

		if (boardIndex < player.getLocation().getIndex()) {
			player.gainMoney(board.getLocationOf(Go.class).getMoneyGained());
		}

		ABoardLocation newLocation = board.getLocation(boardIndex);

		newLocation.playerLandsOnLocation(player);
	}

}
