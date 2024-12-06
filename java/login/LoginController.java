package login;

import java.io.IOException;

import dashboard.DashBoardScreenViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController {

	@FXML
	TextField MobileNumber;

	@FXML
	TextField Password;

	@FXML
	Label errorMessage;

	public void ClickOnButton() throws IOException {

		String user = "8999999999";
		String passwordDb = "admin";

		if (MobileNumber.getText().equals(user)&&Password.getText().equals(passwordDb)) {
			errorMessage.setText("Login Sucess");
			errorMessage.setTextFill(Color.GREEN); 
		  new  DashBoardScreenViewer().show();

		} else {
			errorMessage.setText("Login Failed ");
			errorMessage.setTextFill(Color.RED);
		}
	}
}