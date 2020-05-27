import javafx.scene.media.AudioClip;

public class Data {
	private static int totalHealth = 2020;
	public static final String BUTTON_CLICK = "resources/sounds/button_press.wav";
	public static final String GAME_OVER = "resources/sounds/game_over_actual.wav";
	public static final String MAIN_THRUSTER = "resources/sounds/main_thruster_sound.wav";
	public static final String POWER_UP = "resources/sounds/power_up.wav";
	public static final String SIDE_THRUSTERS = "resources/sounds/side_thrusters.wav";
	public static final String OBSTACLE = "resources/sounds/touching_obstacle.wav";
	public static final String GAME_WON = "resources/sounds/win_music.wav";
	
	public static int getTotalScore() {
		return totalHealth;
	}
	public static void addToScore(int addMe) {
		if(addMe < 0) totalHealth += addMe;
	}
	public static void resetScore() {
		totalHealth = 2020;
	}
	
	public static void setHealth(int health) {
		totalHealth = health;
	}
	
	public AudioClip giveSound(String path) {
		AudioClip req = new AudioClip(getClass().getResource(path).toString());
		req.setVolume(0.2);
		return req; 
	}
	
}
