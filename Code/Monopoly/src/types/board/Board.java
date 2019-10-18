package types.board;

import java.util.HashMap;
import java.util.Map;

import logs.LogHandler;

public class Board {

	private Map<Integer, ABoardLocation> boardLocations;

	public Board() {
		this.boardLocations = new HashMap<>();
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

}
