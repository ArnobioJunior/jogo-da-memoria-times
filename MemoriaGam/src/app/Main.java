package app;

import view.MenuGUI;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	private static Scene SCENE;
	
	public static void mudarTela(Parent root){
		Main.SCENE.setRoot(root);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuGUI root = new MenuGUI();
		SCENE = new Scene(root,800,600, Color.GHOSTWHITE);
	
		primaryStage.setTitle("Copa da Memória!");
		primaryStage.setScene(SCENE);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
