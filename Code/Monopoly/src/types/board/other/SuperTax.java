package types.board.other;

import store.MonopolyStore;
import types.board.ABoardLocation;
import types.player.Player;

public class SuperTax extends ABoardLocation {

	public SuperTax() {
		super(38, "Super Tax");
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		int lostMoney = player.loseMoney(100);
		MonopolyStore.getInstance().getBoard().addFreeParkingMoney(lostMoney);
	}

}
