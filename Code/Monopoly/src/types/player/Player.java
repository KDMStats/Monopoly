package types.player;

import controller.playerModules.APlayerModule;
import types.board.ABoardLocation;

public class Player {

	private final PlayerToken token;
	private int money;
	private ABoardLocation location;
	private boolean isInJail;
	private int jailTurns;

	private final APlayerModule playerModule;

	public Player(PlayerToken token, int money, ABoardLocation location,
			APlayerModule playerModule) {
		this.token = token;
		this.money = money;
		this.location = location;
		this.playerModule = playerModule;
	}

	public boolean hasLost() {
		return money == 0;
	}

	public PlayerToken getToken() {
		return token;
	}

	public int getMoney() {
		return money;
	}

	public ABoardLocation getLocation() {
		return location;
	}

	public APlayerModule getPlayerModule() {
		return playerModule;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setLocation(ABoardLocation location) {
		this.location = location;
	}

	public void arrested() {
		isInJail = true;
		jailTurns = 0;
	}

	public void stayedInJail() {
		jailTurns++;
	}

	public boolean inJail() {
		return isInJail;
	}

	public int getJailTurns() {
		return jailTurns;
	}

	public void releasedFromJail() {
		isInJail = false;
		jailTurns = 0;
	}

	public int loseMoney(int moneyLost) {
		while (money < moneyLost) {
			if (!refinance()) {
				int returnMoney = money;
				money = 0;
				return returnMoney;
			}
		}
		this.money -= moneyLost;
		return moneyLost;
	}

	public void gainMoney(int moneyGained) {
		this.money += moneyGained;
	}

	private boolean refinance() {
		// try to sell houses

		// try to mortgate

		// no trading

		// if nothing left, then lose
		return false;
	}

}
