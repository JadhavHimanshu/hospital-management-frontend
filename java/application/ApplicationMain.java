package application;

import common.StageHolder;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import login.Login;

public class ApplicationMain extends Application {
	public static void main(String args[]) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {    
		StageHolder.stage = primaryStage;    
		
		new Login().show();
	}            

}    