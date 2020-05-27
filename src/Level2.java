import javafx.scene.layout.BorderPane;

public class Level2 extends Level {
	BorderPane border;
	public Level2(BorderPane border) {
		super(border);
		this.border = border;
		// TODO Auto-generated constructor stub
	}

	@Override
	void addUniqueElements() {
		add(new Obstacle(-50, 100, 450, 120));
		add(new Obstacle(550, 100, 500, 120));
		add(new Obstacle(100, 330, 600, 100));
		add(new Obstacle(350, 428, 700, 120));
		add(new Obstacle(-50, 540, 300, 156));
		add(new Target(680, 580, 80, 80));
		add(new HealthPack(720, 350, 80, 80));
		

	}

	@Override
	Spaceship getShip() {
		// TODO Auto-generated method stub
		return new MotherShip(getWidth()/2, getHeight());
	}

	@Override
	public void lostGame() {
		(new Data()).giveSound(Data.GAME_OVER).play();
		stop();
		border.setBottom(null);
		Data.setHealth(0);
		border.setCenter(new EndgameScoreScreen(border, "You LOST :-(", false));
		
	}

	@Override
	public void wonGame() {
		(new Data()).giveSound(Data.GAME_WON).play();
		stop();
		border.setBottom(null);
		if(getScore().getHealth() > 0)
			border.setCenter(new EndgameScoreScreen(border, "You WON!", true));
		else lostGame();
		
		
	}

}
