package store;

import java.util.List;

import types.board.Board;
import types.player.Player;

public class MonopolyStore {

	private static MonopolyStore instance;

	private Board board;
	private List<Player> players;

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
	}

	public Board getBoard() {
		return board;
	}

}
