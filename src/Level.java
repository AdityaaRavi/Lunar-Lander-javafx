import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Level extends World {
	private Score scoreTxt;
	private BorderPane border;
	
	public Level(BorderPane border) {
		
		//putting this level in the screen
		border.setCenter(this);
		this.border = border;

		//game controls and score view
		HBox gameInfo = new HBox();
		scoreTxt = new Score(Data.getTotalScore());
		gameInfo.getChildren().add(scoreTxt);
		Button exitLevel = new Button("Exit Level");
		exitLevel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				border.setBottom(null);
				border.setCenter(new TitleScreen(border));
			}
		});
		
		gameInfo.getChildren().add(exitLevel);
		gameInfo.setSpacing(340);
		border.setBottom(gameInfo);
		gameInfo.setStyle("-fx-background-color: #cdd1ce;");
		gameInfo.setPadding(new Insets(40, 100, 40, 100));
		
		//adding the player
		add(getShip());
		
		//Input listeners
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent e) {
				keyPressed(e.getCode());
			}
		});
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent e) {
				keyReleased(e.getCode());

			}
		});

		addUniqueElements();
		requestFocus();

	}

	abstract Spaceship getShip();
	abstract void addUniqueElements();

	@Override
	public void act(long now) {
		
		scoreTxt.setX(20);
		scoreTxt.setY(getHeight() - getHeight()/20);
		
		

	}

	public Score getScore() {
		return scoreTxt;
	}

}