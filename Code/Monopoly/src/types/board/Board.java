package types.board;

import java.util.HashMap;
import java.util.Map;

import logs.LogHandler;

public class Board {

	private Map<Integer, ABoardLocation> boardLocations;

	private int freeParkingMoney;

	public Board() {
		this.boardLocations = new HashMap<>();
		this.freeParkingMoney = 0;
	}

	public ABoardLocation getLocation(int index) {
		if (!boardLocations.containsKey(index)) {
			LogHandler.getInstance().crash("Cannot access location with index "
					+ index + " on board!");
		}
		return boardLocations.get(index);
	}

	public void addLocation(ABoardLocation location) {
		if (boardLocations.containsKey(location.getIndex())) {
			LogHandler.getInstance().crash("Cannot add location to index "
					+ location.getIndex() + ", location already exists!");
		}
		boardLocations.put(location.getIndex(), location);
	}

	public int size() {
		return boardLocations.size();
	}

	public void addFreeParkingMoney(int money) {
		freeParkingMoney += money;
	}

	public int getFreeParkingMoney() {
		return freeParkingMoney;
	}

	public int takeFreeParkingMoney() {
		int money = freeParkingMoney;
		freeParkingMoney = 0;
		return money;
	}

	public <T extends ABoardLocation> T getLocationOf(Class<T> blClass) {
		for (ABoardLocation location : boardLocations.values()) {
			if (blClass.isInstance(location)) {
				return (T) location;
			}
		}
		LogHandler.getInstance()
				.crash("Could not find Board Location of class type "
						+ blClass.getSimpleName());
		return null;
	}

	public ABoardLocation getLocationByName(String name) {
		for (ABoardLocation location : boardLocations.values()) {
			if (location.getName().equalsIgnoreCase(name)) {
				return location;
			}
		}
		LogHandler.getInstance()
				.crash("Could not find Board Location with name " + name);
		return null;
	}

}
