
import java.util.ArrayList;


import javafx.scene.Node;

public abstract class Actor extends javafx.scene.image.ImageView {
	private boolean toBeRemoved = false;
	public abstract void act(long now);
	
	public void move(double dx, double dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}
	
	public World getWorld() {
		return (World) getParent();
	}
	
	public double getWidth() {
		return getBoundsInParent().getWidth();
	}
	
	public double getHeight() {
		return getBoundsInParent().getHeight();
	}
	
	public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
		ArrayList<A> obj = new ArrayList<A>();
		for(Node e: getParent().getChildrenUnmodifiable()) {
			if(e != this && e.getClass().equals(cls) && intersects(e.getBoundsInParent())) {
				obj.add((A) e);
			}
		}
		return obj;
	}
	
	public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
		for(Node e: getParent().getChildrenUnmodifiable()) {
			if(e != this && e.getClass().equals(cls) && intersects(e.getBoundsInParent())) {
				return (A) e;
			}
		}
		return null;
	}
	
	public boolean needRemoving() {
		return toBeRemoved;
	}
	public void setNeedToRemove(boolean remove) {
		toBeRemoved = remove;
	}
}
