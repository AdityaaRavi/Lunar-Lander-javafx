import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class EndgameScoreScreen extends GameScoreScreen{

	
	public EndgameScoreScreen(BorderPane border, String result, boolean won) {
		super(border, result, won, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLevel1ButtonText(boolean won) {
		return "Restart entire Game";
	}

	@Override
	public String getLevel2ButtonText(boolean won) {
		return "Retry Level 2";
	}


}

