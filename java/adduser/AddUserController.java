package adduser;

import java.io.IOException;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;

import UserManagement.UserManagement;
import common.RestUtils;
import dashboard.DashBoardScreenViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserController {
	@FXML
	TextField userName;
	@FXML
	TextField email;
	@FXML
	TextField mobileNumber;
	@FXML
	TextField gender;
	@FXML
	TextField password;
	@FXML
	TextField confirm;
	@FXML
	Label errorMessager;
	@FXML
	Button Save;
	@FXML
	Button Cancle;

	public void Save() throws IOException, InterruptedException {
		UserRequest request = new UserRequest();

		request.username = userName.getText();
		request.email = email.getText();
		request.mobile = mobileNumber.getText();
		request.gender = gender.getText();
		request.password = password.getText();
		request.Confirm = confirm.getText();
		String url = "http://localhost:8081/adduser";
	    UserResponse response = RestUtils.postRequest(url, request, UserResponse.class);
	    if ("0000".equals(response.getResponseCode())) {
			errorMessager.setText("User Saved Successfully");
			errorMessager.setTextFill(Color.GREEN);
		} else {
			errorMessager.setText("Error");
		}         
	}

	public void Cancle() {
		new UserManagement().show();
		System.out.println("button Clicked");

	}

}
