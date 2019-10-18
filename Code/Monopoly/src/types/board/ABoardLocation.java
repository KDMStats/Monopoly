package types.board;

import types.player.Player;

public abstract class ABoardLocation {

	protected int index;
	protected String name;

	public ABoardLocation(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public abstract void playerLandsOnLocation(Player player);

	public int getIndex() {
		return index;
	}
}
