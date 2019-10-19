package setup;

import java.util.ArrayList;
import java.util.List;

import controller.playerModules.StupidPlayerModule;
import run.MonopolyRun;
import types.board.ABoardLocation;
import types.player.Player;
import types.player.PlayerToken;

public class PlayerSetup {

	public static List<Player> getAllStartingPlayers(ABoardLocation go) {
		List<Player> players = new ArrayList<>();

		for (int i = 0; i < MonopolyRun.PLAYER_COUNT; i++) {
			players.add(getNewStartingPlayer(i, go));
		}
		return players;
	}

	private static Player getNewStartingPlayer(int i, ABoardLocation go) {
		return new Player(PlayerToken.values()[i], 1500, go,
				new StupidPlayerModule());
	}
}
