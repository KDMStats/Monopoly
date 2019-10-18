package run;

import java.util.List;

import logs.LogHandler;
import setup.BoardSetup;
import setup.PlayerSetup;
import store.MonopolyStore;
import types.board.Board;
import types.player.Player;

public class MonopolyRun {

	public static final int PLAYER_COUNT = 4;

	public MonopolyRun() {
		LogHandler.getInstance().setPrintLogs(false);

		Board board = BoardSetup.getNewBoard();
		List<Player> players = PlayerSetup
				.getAllStartingPlayers(board.getLocation(0));

		MonopolyStore.getInstance().initialise(board, players);

	}

	public static void main(String[] args) {
		new MonopolyRun();
	}

}
