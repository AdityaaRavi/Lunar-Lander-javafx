import javafx.scene.image.Image;

public class Obstacle extends Actor {
	
	public Obstacle(double x, double y, double width, double height) {
		setX(x);
		setY(y);
		setImage(new Image(getClass().getClassLoader().getResource("resources/moon_rock_beta.png").toString()));
		setFitHeight(height);
		setFitWidth(width);
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub

	}

}
