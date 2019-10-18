package types.board.properties;

import types.player.Player;

public class RealEstate extends AProperty {

	public RealEstate(int index, String name) {
		super(index, name);
	}

	@Override
	public int getRent() {
		return determineRealEstateRent();
	}

	private int determineRealEstateRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		// TODO Auto-generated method stub

	}

}
