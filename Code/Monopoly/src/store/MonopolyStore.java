package store;

import java.util.ArrayList;
import java.util.List;

import types.board.Board;
import types.player.Player;

public class MonopolyStore {

	private static MonopolyStore instance;

	private Board board;
	private List<Player> players;

	private int turnIndex;

	public static MonopolyStore getInstance() {
		if (instance == null) {
			instance = new MonopolyStore();
		}
		return instance;
	}

	private MonopolyStore() {
	}

	public void initialise(Board board, List<Player> players) {
		this.board = board;
		this.players = players;
		this.turnIndex = 0;
	}

	public Board getBoard() {
		return board;
	}

	public Player getCurrentPlayer() {
		return players.get(turnIndex);
	}

	public void nextPlayersTurn() {
		turnIndex++;
		if (turnIndex == players.size()) {
			turnIndex = 0;
		}
	}

	public List<Player> getActivePlayers() {
		List<Player> activePlayers = new ArrayList<>();
		for (Player player : players) {
			if (!player.hasLost()) {
				activePlayers.add(player);
			}
		}
		return activePlayers;
	}

}
