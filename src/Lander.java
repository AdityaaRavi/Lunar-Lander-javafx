import javafx.scene.image.Image;

public class Lander extends Spaceship {

	public Lander(double x, double y) {
		setImage(new Image(getClass().getClassLoader().getResource("resources/brick.png").toString()));
		setX(x);
		setY(y);
	}
	
	@Override
	public int getDxRight() {
		return 5;
	}

	@Override
	public int getDY() {
		// TODO Auto-generated method stub
		return -5;
	}

	@Override
	public int getGdy() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getDxLeft() {
		// TODO Auto-generated method stub
		return -5;
	}

}
