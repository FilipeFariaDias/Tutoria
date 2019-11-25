package Tutoria;

	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException{
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		
		Scene scene = new Scene(root,750,640);
		primaryStage.setMaximized(false);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tutorial de Sobrevivência na Universidade");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
