import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game extends Application{

	public static final int KEYBOARD_DX = 5;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		primaryStage.setTitle("LUNAR PILOT! v1.0");
		primaryStage.setResizable(false);
		
		TitleScreen title = new TitleScreen(border);
		
		Scene scene = new Scene(border, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
