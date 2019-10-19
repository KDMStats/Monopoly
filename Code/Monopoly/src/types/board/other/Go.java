package types.board.other;

import types.board.ABoardLocation;
import types.player.Player;

public class Go extends ABoardLocation {

	public Go() {
		super(0, "Go");
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		// Do Nothing, $200 will be given elsewhere
	}

	public int getMoneyGained() {
		return 200;
	}

}
