package types.board.properties;

import types.player.Player;

public class Station extends AProperty {

	public Station(int index, String name) {
		super(index, name);
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
