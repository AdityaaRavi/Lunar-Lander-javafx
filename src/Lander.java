import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;

public class Lander extends Spaceship {

	public Lander(double x, double y) {
		setImage(new Image(getClass().getClassLoader().getResource("resources/lander_ship_final.png").toString()));
		setX(x);
		setY(y);
		setFitHeight(50);
		setFitWidth(50);
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

	@Override
	public AudioClip getRightSound() {
		return (new Data()).giveSound(Data.SIDE_THRUSTERS);
	}

	@Override
	public AudioClip getLeftSound() {
		return (new Data()).giveSound(Data.SIDE_THRUSTERS);
	}

	@Override
	public AudioClip getUpSound() {
		return (new Data()).giveSound(Data.MAIN_THRUSTER);
	}

}
