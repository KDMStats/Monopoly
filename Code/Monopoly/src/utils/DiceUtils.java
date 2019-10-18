package utils;

public class DiceUtils {

	private static int rollDX(int size) {
		return (int) (Math.random() * size) + 1;
	}

	public static int rollD6() {
		return rollDX(6);
	}

	public static int roll2D6() {
		return rollDX(6) + rollDX(6);
	}

}
