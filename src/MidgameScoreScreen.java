import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MidgameScoreScreen extends GameScoreScreen{

	int level = 1;
	public MidgameScoreScreen(BorderPane border, String result, boolean won, int level) {
		super(border, result, won, level);
		this.level = level;
	}

	@Override
	public String getLevel1ButtonText(boolean won) {
		return "Restart Level 1";
	}

	@Override
	public String getLevel2ButtonText(boolean won) {
		if(won) return "Continue to Level 2";
		return "Skip to Level 2";
	}
		
}

