package types.board.properties;

import types.player.Player;

public class RealEstate extends AProperty {

	private final int setIndex;
	private final int housePrice;
	private final int[] rent;

	private int numberOfHouses;

	public RealEstate(int index, String name, int purchasePrice,
			int mortgatePrice, int setIndex, int housePrice, int[] rent) {
		super(index, name, purchasePrice, mortgatePrice);
		this.setIndex = setIndex;
		this.housePrice = housePrice;
		this.rent = rent;
		this.numberOfHouses = 0;
	}

	@Override
	public int getRent() {
		return determineRealEstateRent();
	}

	private int determineRealEstateRent() {
		return 0;
	}

	@Override
	public void playerLandsOnLocation(Player player) {

	}

}
