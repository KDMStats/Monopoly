package types.board.other;

import store.MonopolyStore;
import types.board.ABoardLocation;
import types.player.Player;

public class IncomeTax extends ABoardLocation {

	public IncomeTax() {
		super(4, "Income Tax");
	}

	@Override
	public void playerLandsOnLocation(Player player) {
		int moneyToLose = 200;
		if (player.getMoney() / 10 < 200) {
			moneyToLose = player.getMoney() / 10;
		}

		int lostMoney = player.loseMoney(moneyToLose);
		MonopolyStore.getInstance().getBoard().addFreeParkingMoney(lostMoney);
	}

}
