package types.board.properties;

import types.player.Player;

public class Utility extends AProperty {

	public Utility(int index, String name) {
		super(index, name);
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
