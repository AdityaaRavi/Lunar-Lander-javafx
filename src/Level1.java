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
		
		
	}

	@Override
	Spaceship getShip() {
		return new Lander(getWidth()/2, getHeight());
	}
	

}
