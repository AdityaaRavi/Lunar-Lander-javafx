
public class Data {
	private static int totalHealth = 2020;
	
	
	public static int getTotalScore() {
		return totalHealth;
	}
	public static void addToScore(int addMe) {
		if(addMe < 0) totalHealth += addMe;
	}
	public static void resetScore() {
		totalHealth = 2020;
	}
}