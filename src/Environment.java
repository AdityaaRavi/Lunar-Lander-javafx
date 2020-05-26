import javafx.scene.image.Image;

public abstract class Environment extends Actor {

	public Environment(double x, double y, double width, double height, String imagePath) {
		setX(x);
		setY(y);
		setImage(new Image(getClass().getClassLoader().getResource(imagePath).toString()));
		setFitHeight(height);
		setFitWidth(width);
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub

	}

}
