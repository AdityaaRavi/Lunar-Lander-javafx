import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Score extends Text {
	private int score;
	int test = 0;
	public Score() {
		score = 0;
		setFont(new Font(20));
		updateDisplay();
	}
	
	public Score(int start) {
		score = start;
		setFont(new Font(20));
		updateDisplay();
	}
	
	public void updateDisplay() {
		setText("Press 'W' to start!\nHealth:\t" + score);
	}
	
	public int getHealth() {
		return score;
	}
	public void setHealth(int score) {
		Data.setHealth(score);
		this.score = score;
		updateDisplay();
	}
}
