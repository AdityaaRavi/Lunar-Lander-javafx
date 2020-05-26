import java.util.ArrayList;
import java.util.HashSet;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;

public abstract class World extends Pane {
	private javafx.animation.AnimationTimer timer;
	private HashSet<KeyCode> keysDown;

	public World() {
		timer = new AnimationTimer() {

			@Override
			public void handle(long now) {
				act(now);
				for (Node n : getChildren()) {
					if (n instanceof Actor) {
						Actor p = (Actor) (n);
						//set position of things here if they don't cooperate.
						p.act(now);

					}
				}

			}

		};
		timer.start();
		keysDown = new HashSet<KeyCode>();
	}

	public abstract void act(long now);

	public void start() {
		timer.start();
	}

	public void stop() {
		timer.stop();
	}

	public void remove(Actor actor) {
		getChildren().remove(actor);

	}

	public void add(Actor actor) {
		getChildren().add(actor);
	}

	public <A extends Actor> java.util.List<A> getObjects(java.lang.Class<A> cls) {
		ArrayList<A> array = new ArrayList<A>();
		for (Node n : getChildren()) {
			if (n.getClass().isInstance(cls)) {
				array.add(cls.cast(n));
			}
		}

		return array;
	}

	public void keyPressed(KeyCode e) {
		keysDown.add(e);
	}

	public void keyReleased(KeyCode e) {
		keysDown.remove(e);
	}

	public boolean isKeyDown(KeyCode e) {
		return keysDown.contains(e);
	}
	public int numKeysPressed() {
		return keysDown.size();
	}
}
