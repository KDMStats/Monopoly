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
		board.addLocation(new RealEstate(1, "Old Kent Road", 60, 30, 0, 50,
				new int[] { 2, 10, 30, 90, 160, 250 }));
		board.addLocation(new CommunityChest(2));
		board.addLocation(new RealEstate(3, "Whitechapel Road", 60, 30, 0, 50,
				new int[] { 4, 20, 60, 180, 320, 450 }));
		board.addLocation(new IncomeTax());
		board.addLocation(new Station(5, "King's Cross Station", 200, 100));
		board.addLocation(new RealEstate(6, "The Angel Islington", 100, 50, 1,
				50, new int[] { 6, 30, 90, 270, 400, 550 }));
		board.addLocation(new Chance(7));
		board.addLocation(new RealEstate(8, "Euston Road", 100, 50, 1, 50,
				new int[] { 6, 30, 90, 270, 400, 550 }));
		board.addLocation(new RealEstate(9, "Pentonville Road", 120, 60, 1, 50,
				new int[] { 8, 40, 100, 300, 450, 600 }));
		board.addLocation(new Jail());
		board.addLocation(new RealEstate(11, "Pall Mall", 140, 70, 2, 100,
				new int[] { 10, 50, 150, 450, 625, 750 }));
		board.addLocation(new Utility(12, "Electric Company", 150, 75));
		board.addLocation(new RealEstate(13, "Whitehall", 140, 70, 2, 100,
				new int[] { 10, 50, 150, 450, 625, 750 }));
		board.addLocation(new RealEstate(14, "Northumberland Avenue", 160, 80,
				2, 100, new int[] { 12, 60, 180, 500, 700, 900 }));
		board.addLocation(new Station(15, "Marylebone Station", 200, 100));
		board.addLocation(new RealEstate(16, "Bow Street", 180, 90, 3, 100,
				new int[] { 14, 70, 200, 550, 750, 950 }));
		board.addLocation(new CommunityChest(17));
		board.addLocation(new RealEstate(18, "Marlborough Street", 180, 90, 3,
				100, new int[] { 14, 70, 200, 550, 750, 950 }));
		board.addLocation(new RealEstate(19, "Vine Street", 200, 100, 3, 100,
				new int[] { 16, 80, 220, 600, 800, 1000 }));
		board.addLocation(new FreeParking());
		board.addLocation(new RealEstate(21, "Strand", 220, 110, 4, 150,
				new int[] { 18, 90, 250, 700, 875, 1050 }));
		board.addLocation(new Chance(22));
		board.addLocation(new RealEstate(23, "Fleet Street", 220, 110, 4, 150,
				new int[] { 18, 90, 250, 700, 875, 1050 }));
		board.addLocation(new RealEstate(24, "Trafalgar Square", 240, 120, 4,
				150, new int[] { 20, 100, 300, 750, 925, 1100 }));
		board.addLocation(new Station(25, "Frenchurch St. Station", 200, 100));
		board.addLocation(new RealEstate(26, "Leicester Square", 260, 130, 5,
				150, new int[] { 22, 110, 330, 800, 975, 1150 }));
		board.addLocation(new RealEstate(27, "Coventry Street", 260, 130, 5,
				150, new int[] { 22, 110, 330, 800, 975, 1150 }));
		board.addLocation(new Utility(28, "Water Works", 150, 75));
		board.addLocation(new RealEstate(29, "Piccadilly", 280, 140, 5, 150,
				new int[] { 24, 120, 360, 850, 1025, 1200 }));
		board.addLocation(new GoToJail());
		board.addLocation(new RealEstate(31, "Regent Street", 300, 150, 6, 200,
				new int[] { 26, 130, 390, 900, 1100, 1275 }));
		board.addLocation(new RealEstate(32, "Oxford Street", 300, 150, 6, 200,
				new int[] { 26, 130, 390, 900, 1100, 1275 }));
		board.addLocation(new CommunityChest(33));
		board.addLocation(new RealEstate(34, "Bond Street", 320, 160, 6, 200,
				new int[] { 28, 150, 450, 1000, 1200, 1400 }));
		board.addLocation(new Station(35, "Liverpool St. Station", 200, 100));
		board.addLocation(new Chance(36));
		board.addLocation(new RealEstate(37, "Park Lane", 350, 175, 7, 200,
				new int[] { 35, 175, 500, 1100, 1300, 1500 }));
		board.addLocation(new SuperTax());
		board.addLocation(new RealEstate(39, "Mayfair", 400, 200, 7, 200,
				new int[] { 50, 200, 600, 1400, 1700, 2000 }));

		return board;
	}
}
