import javafx.scene.layout.BorderPane;


public class Level1 extends Level {

	public Level1(BorderPane border) {
		super(border);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addUniqueElements() {
		//add walls here
		//walls are actors, so make an image for the wall
		add(new Obstacle(-100, 100, 700, 150));
		add(new Obstacle(300, 400, 700, 150));
		
		
	}

	@Override
	Spaceship getShip() {
		return new Lander(getWidth()/2, getHeight());
	}
	

}
