package types.board.properties;

import types.player.Player;

public class Utility extends AProperty {

	public Utility(int index, String name, int purchasePrice,
			int mortgatePrice) {
		super(index, name, purchasePrice, mortgatePrice);
	}

	@Override
	public int getRent() {
		return determineUtilityRent();
	}

	private int determineUtilityRent() {
		return 0;
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		// TODO Auto-generated method stub

	}

}
