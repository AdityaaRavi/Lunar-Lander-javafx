import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TitleScreen extends World {

	public TitleScreen(BorderPane border) {

		Text text = new Text("Welcome to Lunar Pilot! ");
		text.setFont(new Font(30));
		
		
		Button level1 = new Button("Play");
		Button level2 = new Button(" SKIP to Level 2");
		Button quit = new Button("Exit");
		
		HBox hbox = new HBox(level1, level2, quit); 
		hbox.setSpacing(70);
		BorderPane.setMargin(hbox, new Insets(60, 200, 60, 220));
		BorderPane.setMargin(text, new Insets(380, 100, 80, 220));
		border.setTop(text);

		
		border.setBottom(hbox);
		level1.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	border.setTop(null);
            	border.setBottom(null);
            	Data.resetScore();
                border.setCenter(new Level1(border));
            }
        });
		level2.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	border.setTop(null);
            	border.setBottom(null);
            	Data.resetScore();
                border.setCenter(new Level2(border));
            }
        });
        
		quit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
	}

	@Override
	public void act(long now) {
		

	}

}
