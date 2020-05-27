import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Instructions extends World {
	
	public Instructions(BorderPane border) {
		
		border.setStyle("-fx-background-image: url('resources/instructions.png');" +
		        "-fx-background-repeat: stretch;" +
		        "-fx-background-size: 600 600;" +
		        "-fx-background-position: center center;");
		
		Button home = new Button("Go to home screen");
		border.setBottom(home);
		BorderPane.setMargin(home, new Insets(20, 100, 40, 320));
		
		home.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				(new Data()).giveSound(Data.BUTTON_CLICK).play();
				border.setStyle("-fx-background-image: url('resources/home_screen_image_try2.jpg');" +
				        "-fx-background-repeat: stretch;" +
				        "-fx-background-size: 1000 900;" +
				        "-fx-background-position: center center;");
				border.setTop(null);
            	border.setBottom(null);
                border.setCenter(new TitleScreen(border));
			}
		});
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub

	}

}
