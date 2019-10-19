package types.board.properties;

import types.board.ABoardLocation;
import types.player.Player;

public abstract class AProperty extends ABoardLocation {

	protected final int purchasePrice;
	protected final int mortgatePrice;

	protected Player owner;
	protected boolean isMortgaged;

	public AProperty(int index, String name, int purchasePrice,
			int mortgatePrice) {
		super(index, name);
		this.purchasePrice = purchasePrice;
		this.mortgatePrice = mortgatePrice;
		this.owner = null;
		this.isMortgaged = false;
	}

	public abstract int getRent();
}
