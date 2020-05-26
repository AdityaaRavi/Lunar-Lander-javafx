import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class GameScoreScreen extends World {

	public GameScoreScreen(BorderPane border, String result, boolean won, int level) {
		Text text = new Text("\t    Level " + level + " \n\n\t" + result + "\nYou have\t" + Data.getTotalScore() + " Health.");
		text.setFont(new Font(30));
		
		Button level1 = new Button(getLevel1ButtonText(won));
		Button level2 = new Button(getLevel2ButtonText(won));
		Button home = new Button("Go to home screen");
		Button quit = new Button("Exit");
		
			
		HBox hbox = new HBox(level1, level2, home, quit); 
		hbox.setSpacing(50);
		BorderPane.setMargin(hbox, new Insets(60, 60, 60, 60));
		BorderPane.setMargin(text, new Insets(250, 100, 80, 250));
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
            	Level2 level = new Level2(border);
            	if(won) level.getScore().setHealth(level.getScore().getHealth() + 1040);
            	else level.getScore().setHealth(level.getScore().getHealth() + 200);
                border.setCenter(level);
            }
        });
        
		home.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				border.setTop(null);
            	border.setBottom(null);
            	Data.resetScore();
                border.setCenter(new TitleScreen(border));
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
		// TODO Auto-generated method stub

	}
	public abstract String getLevel1ButtonText(boolean won);
	public abstract String getLevel2ButtonText(boolean won);
	
	

}
