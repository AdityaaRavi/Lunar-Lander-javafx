import javafx.scene.input.KeyCode;

public abstract class Spaceship extends Actor {

	private boolean onGround = false;
	
	@Override
	public void act(long now) {
		if(getWorld().isKeyDown(KeyCode.LEFT) && !onGround) move(getDxLeft(), 0);
		if(getWorld().isKeyDown(KeyCode.RIGHT) && !onGround) move(getDxRight(), 0);
		if(getWorld().isKeyDown(KeyCode.UP)) {
			move(0, getDY());
			onGround = false;
		}
		else if(!onGround) move(0, getGdy());
		
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
		
		//Add collision detection here
		
		
		//don't remove, this updates the score every frame.
		Score txt = ((Level)getWorld()).getScore();
		txt.setHealth(txt.getHealth() + healthChange);

	}

	public abstract int getDxRight();
	public abstract int getDxLeft();
	public abstract int getDY();
	public abstract int getGdy();

}
