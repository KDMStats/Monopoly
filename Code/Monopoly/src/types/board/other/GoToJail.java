package types.board.other;

import store.MonopolyStore;
import types.board.ABoardLocation;
import types.player.Player;

public class GoToJail extends ABoardLocation {

	public GoToJail() {
		super(30, "Go To Jail");
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		player.arrested();
		player.setLocation(MonopolyStore.getInstance().getBoard()
				.getLocationOf(Jail.class));
	}

}
