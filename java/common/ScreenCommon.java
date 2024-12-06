package common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ScreenCommon { 
	public void show() {
	String myClassNmae=getClass().getSimpleName();
	String classFilePath=getClass().getResource(myClassNmae +".class").toString();
	String fxmlFilePath=classFilePath.replace(".class", ".fxml");
	String actualPath=fxmlFilePath.substring(8);

	try {
	URL fxmlurl=Paths.get(actualPath).toUri().toURL();
	try {
	Parent actorGroup=FXMLLoader.load(fxmlurl);
	Scene scene=new Scene(actorGroup, 1235, 800);
	StageHolder.stage.setScene(scene); 
	StageHolder.stage.setMaximized(true);
	StageHolder.stage.show();
	} catch (IOException e) {
	e.printStackTrace();
	}
	} catch (MalformedURLException e) {
	e.printStackTrace();
	}

	}

	}
	    
	





