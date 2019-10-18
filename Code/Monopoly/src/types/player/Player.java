package types.player;

import types.board.ABoardLocation;

public class Player {

	private PlayerToken token;
	private int money;
	private ABoardLocation location;

	public Player(PlayerToken token, int money, ABoardLocation location) {
		this.token = token;
		this.money = money;
		this.location = location;
	}
}
