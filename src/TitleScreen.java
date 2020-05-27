import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TitleScreen extends World {

	public TitleScreen(BorderPane border) {

		Text text = new Text("Welcome to Lunar Pilot! ");
		text.setFont(new Font(50));
		text.setFill(Color.WHITE);
		
		Button level1 = new Button("Play");
		Button level2 = new Button(" SKIP to Level 2");
		Button quit = new Button("Exit");
		Button instructions = new Button("Instructions");
		
		HBox hbox = new HBox(level1, level2, instructions, quit); 
		hbox.setSpacing(50);
		hbox.setPadding(new Insets(60, 100, 110, 190));
		BorderPane.setMargin(text, new Insets(250, 100, 250, 150)); //top = 380
		border.setTop(text);
		//border.getTop().setStyle("-fx-background-color: #444454;");
		border.setStyle("-fx-background-image: url('resources/home_screen_image_try2.jpg');" +
		        "-fx-background-repeat: stretch;" +
		        "-fx-background-size: 1000 900;" +
		        "-fx-background-position: center center;");
		text.setStyle("-fx-background-color: #FFFFFF;");
		
		border.setBottom(hbox);
		//hbox.setStyle("-fx-background-color: #c9c9b7;");
		/*hbox.setStyle("-fx-background-image: url('resources/home_screen_image_try2.jpg');" +
		        "-fx-background-repeat: crop;" +
		        "-fx-background-size: 1000 900;" +
		        "-fx-background-position: center center;");
		*/
		level1.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	(new Data()).giveSound(Data.BUTTON_CLICK).play();
            	border.setTop(null);
            	border.setBottom(null);
            	Data.resetScore();
                border.setCenter(new Level1(border));
            }
        });
		level2.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	(new Data()).giveSound(Data.BUTTON_CLICK).play();
            	border.setTop(null);
            	border.setBottom(null);
            	Data.resetScore();
                border.setCenter(new Level2(border));
            }
        });
        
		quit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				(new Data()).giveSound(Data.BUTTON_CLICK).play();
				System.exit(0);
				
			}
			
		});
		
		instructions.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	(new Data()).giveSound(Data.BUTTON_CLICK).play();
            	border.setTop(null);
            	border.setBottom(null);
            	//Data.resetScore();
                border.setCenter(new Instructions(border));
            }
        });
	}
	
	public void style()
	{
		setStyle("-fx-background-image: url('resources/home_screen_image_try2.jpg');" +
		        "-fx-background-repeat: crop;" +
		        "-fx-background-size: 1000 900;" +
		        "-fx-background-position: center center;");
	}

	@Override
	public void act(long now) {
		

	}

}
