package types.board.other;

import store.MonopolyStore;
import types.board.ABoardLocation;
import types.player.Player;

public class FreeParking extends ABoardLocation {

	public FreeParking() {
		super(20, "Free Parking");
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		int money = MonopolyStore.getInstance().getBoard()
				.takeFreeParkingMoney();
		player.gainMoney(money);
	}

}
