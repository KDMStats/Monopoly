package setup;

import types.board.Board;
import types.board.other.Chance;
import types.board.other.CommunityChest;
import types.board.other.FreeParking;
import types.board.other.Go;
import types.board.other.GoToJail;
import types.board.other.IncomeTax;
import types.board.other.Jail;
import types.board.other.SuperTax;
import types.board.properties.RealEstate;
import types.board.properties.Station;
import types.board.properties.Utility;

public class BoardSetup {

	public static Board getNewBoard() {
		Board board = new Board();

		board.addLocation(new Go());
		board.addLocation(new RealEstate(1, "Old Kent Road"));
		board.addLocation(new CommunityChest(2));
		board.addLocation(new RealEstate(3, "Whitechapel Road"));
		board.addLocation(new IncomeTax());
		board.addLocation(new Station(5, "King's Cross Station"));
		board.addLocation(new RealEstate(6, "The Angel Islington"));
		board.addLocation(new Chance(7));
		board.addLocation(new RealEstate(8, "Euston Road"));
		board.addLocation(new RealEstate(9, "Pentonville Road"));
		board.addLocation(new Jail());
		board.addLocation(new RealEstate(11, "Pall Mall"));
		board.addLocation(new Utility(12, "Electric Company"));
		board.addLocation(new RealEstate(13, "Whitehall"));
		board.addLocation(new RealEstate(14, "Northumberland Avenue"));
		board.addLocation(new Station(15, "Marylebone Station"));
		board.addLocation(new RealEstate(16, "Bow Street"));
		board.addLocation(new CommunityChest(17));
		board.addLocation(new RealEstate(18, "Marlborough Street"));
		board.addLocation(new RealEstate(19, "Vine Street"));
		board.addLocation(new FreeParking());
		board.addLocation(new RealEstate(21, "Strand"));
		board.addLocation(new Chance(22));
		board.addLocation(new RealEstate(23, "Fleet Street"));
		board.addLocation(new RealEstate(24, "Trafalgar Square"));
		board.addLocation(new Station(25, "Frenchurch St. Station"));
		board.addLocation(new RealEstate(26, "Leicester Square"));
		board.addLocation(new RealEstate(27, "Coventry Street"));
		board.addLocation(new Utility(28, "Water Works"));
		board.addLocation(new RealEstate(29, "Piccadilly"));
		board.addLocation(new GoToJail());
		board.addLocation(new RealEstate(31, "Regent Street"));
		board.addLocation(new RealEstate(32, "Oxford Street"));
		board.addLocation(new CommunityChest(33));
		board.addLocation(new RealEstate(34, "Bond Street"));
		board.addLocation(new Station(35, "Liverpool St. Station"));
		board.addLocation(new Chance(36));
		board.addLocation(new RealEstate(37, "Park Lane"));
		board.addLocation(new SuperTax());
		board.addLocation(new RealEstate(39, "Mayfair"));

		return board;
	}
}
