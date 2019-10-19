package types.board.properties;

import types.player.Player;

public class Station extends AProperty {

	public Station(int index, String name, int purchasePrice,
			int mortgatePrice) {
		super(index, name, purchasePrice, mortgatePrice);
	}

	@Override
	public int getRent() {
		return determineStationRent();
	}

	private int determineStationRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		// TODO Auto-generated method stub

	}

}
