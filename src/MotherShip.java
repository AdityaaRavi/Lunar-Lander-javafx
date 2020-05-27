import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;

public class MotherShip extends Spaceship {

	public MotherShip(double x, double y) {
		setImage(new Image(getClass().getClassLoader().getResource("resources/mother_ship_final.png").toString()));
		setX(x);
		setY(y);
		setFitHeight(35);
		setFitWidth(70);
	}
	
	@Override
	public int getDxRight() {
		return 6;
	}

	@Override
	public int getDxLeft() {
		// TODO Auto-generated method stub
		return -4;
	}

	@Override
	public int getDY() {
		// TODO Auto-generated method stub
		return -6;
	}

	@Override
	public int getGdy() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public AudioClip getRightSound() {
		return (new Data()).giveSound(Data.MAIN_THRUSTER);
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
