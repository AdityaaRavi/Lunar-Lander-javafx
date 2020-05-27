import javafx.scene.input.KeyCode;
import javafx.scene.media.AudioClip;

public abstract class Spaceship extends Actor {

	private boolean onGround = false;
	private int prevYMovement = 0;
	
	@Override
	public void act(long now) {
		if(getWorld().isKeyDown(KeyCode.A) && !onGround && getOneIntersectingObject(Obstacle.class) == null) {
			getLeftSound().play();
			move(getDxLeft(), 0);
		}
		if(getWorld().isKeyDown(KeyCode.D) && !onGround && getOneIntersectingObject(Obstacle.class) == null) {
			getRightSound().play();
			move(getDxRight(), 0);
		}
		if(getWorld().isKeyDown(KeyCode.W) && getOneIntersectingObject(Obstacle.class) == null) {
			getUpSound().play();
			prevYMovement = getDY();
			move(0, getDY());
			onGround = false;
		}
		else if(!onGround) {
			prevYMovement = getGdy();
			move(0, getGdy());
		}
		
		
		//score reduced if the craft goes out of bounds and bringing it back into bounds
		int healthChange = 0;
		if(getX() < 0) healthChange -= 20;
		
		if(getY() < 0) {
			healthChange -= 20;
			setY(getY() + 40);
		}
		
		if(getX() > getWorld().getWidth()) healthChange -= 20;
		
		if(getY() > getWorld().getHeight()) {
			setY(getWorld().getHeight() - 40);
			onGround = true;
		}
		
		//System.out.println("X: " + getX() + ", Y: " + getY());
		//System.out.println("World Height: "  + getWorld().getHeight() + ", width: " + getWorld().getWidth());
		
		
		//bonus health points check
		if(getOneIntersectingObject(Obstacle.class) != null && getOneIntersectingObject(HealthPack.class) != null) {
			healthChange += 500;
			getWorld().remove(getOneIntersectingObject(HealthPack.class));
		}
		
		//Add win detection
		if(getOneIntersectingObject(Obstacle.class) != null && getOneIntersectingObject(Target.class) != null) {
			healthChange += 1000;
			((Level)getWorld()).wonGame();
		}
		
		//Add collision detection and downward movement prevention.
		if(getOneIntersectingObject(Obstacle.class) != null) {
			healthChange -= 10;
			if(prevYMovement > 0) setY(getY() - getGdy());
			if(prevYMovement < 0) setY(getY() - getDY());
			if(getWorld().isKeyDown(KeyCode.A)) setX(getX() - getDxLeft());
			if(getWorld().isKeyDown(KeyCode.D)) setX(getX() - getDxRight());
		}
		
		
		
		//don't remove, this updates the score every frame.
		if(healthChange < 0) (new Data()).giveSound(Data.OBSTACLE).play();
		else if(healthChange > 0) (new Data()).giveSound(Data.POWER_UP).play();
		Score txt = ((Level)getWorld()).getScore();
		txt.setHealth(txt.getHealth() + healthChange);

	}

	public abstract int getDxRight();
	public abstract int getDxLeft();
	public abstract int getDY();
	public abstract int getGdy();
	
	public abstract AudioClip getRightSound();
	public abstract AudioClip getLeftSound();
	public abstract AudioClip getUpSound();

}
