package types.board.properties;

import types.board.ABoardLocation;
import types.player.Player;

public abstract class AProperty extends ABoardLocation {

	protected Player owner;
	protected boolean isMortgaged;

	public AProperty(int index, String name) {
		super(index, name);
		this.owner = null;
		this.isMortgaged = false;
	}

	public abstract int getRent();
}
