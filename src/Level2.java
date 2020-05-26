import javafx.scene.layout.BorderPane;

public class Level2 extends Level {

	public Level2(BorderPane border) {
		super(border);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addUniqueElements() {
		

	}

	@Override
	Spaceship getShip() {
		// TODO Auto-generated method stub
		return new MotherShip(getWidth()/2, getHeight());
	}

}
