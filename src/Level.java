import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
		exitLevel.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				border.setBottom(null);
				border.setCenter(new TitleScreen(border));
				
			}
		});
		setStyle("-fx-background-color: #444454;");
		gameInfo.getChildren().add(exitLevel);
		gameInfo.setSpacing(340);
		border.setBottom(gameInfo);
		gameInfo.setStyle("-fx-background-image: url('resources/moon_rock_beta.png');" +
		        "-fx-background-repeat: stretch;" +
		        "-fx-background-size: 810 150;" +
		        "-fx-background-position: center center;");
		//gameInfo.setStyle("-fx-background-color: #cdd1ce;");
		gameInfo.setPadding(new Insets(20, 100, 40, 100));
		
		//adding game elements
		addUniqueElements();
		add(getShip());
		add(new Obstacle(-10, 660, 850, 151));
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

		//addUniqueElements();
		requestFocus();

	}

	abstract Spaceship getShip();
	abstract void addUniqueElements();

	@Override
	public void act(long now) {
		
		scoreTxt.setX(20);
		scoreTxt.setY(getHeight() - getHeight()/20);
		if(scoreTxt.getHealth() < 0) lostGame();
		

	}

	public abstract void lostGame();

	public Score getScore() {
		return scoreTxt;
	}

	public abstract void wonGame();

}