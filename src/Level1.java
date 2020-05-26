import javafx.scene.layout.BorderPane;


public class Level1 extends Level {

	BorderPane border;
	public Level1(BorderPane border) {
		super(border);
		this.border = border;
		// TODO Auto-generated constructor stub
	}

	@Override
	void addUniqueElements() {
		//add walls here
		//walls are actors, so make an image for the wall
		add(new Obstacle(-50, 100, 750, 150));
		add(new Obstacle(100, 400, 900, 150));
		add(new Target(640, 560, 100, 100));
		
	}

	@Override
	Spaceship getShip() {
		return new Lander(getWidth()/2, getHeight());
	}

	@Override
	public void lostGame() {
		stop();
		border.setBottom(null);
		border.setCenter(new MidgameScoreScreen(border, "YOU LOST :-(", false, 1));
		
	}

	@Override
	public void wonGame() {
		stop();
		border.setBottom(null);
		border.setCenter(new MidgameScoreScreen(border, "YOU WON!", true, 1));
		
	}
	

}
