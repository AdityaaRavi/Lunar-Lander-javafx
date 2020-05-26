import javafx.scene.image.Image;

public class MotherShip extends Spaceship {

	public MotherShip(double x, double y) {
		setImage(new Image(getClass().getClassLoader().getResource("resources/brick2.png").toString()));
		setX(x);
		setY(y);
	}
	
	@Override
	public int getDxRight() {
		return 8;
	}

	@Override
	public int getDxLeft() {
		// TODO Auto-generated method stub
		return -4;
	}

	@Override
	public int getDY() {
		// TODO Auto-generated method stub
		return -7;
	}

	@Override
	public int getGdy() {
		// TODO Auto-generated method stub
		return 4;
	}

}
