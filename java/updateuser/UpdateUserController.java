package updateuser;

import java.io.IOException;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;

import UserManagement.UserManagement;
import common.RestUtils;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class UpdateUserController {
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
	TextField confirmPassword;
	@FXML
	TextField Name;
	@FXML
	TextField userId;
	@FXML
	Label errorMessage;
	@FXML
	Button save;
	@FXML
	Button cancle;
	@FXML
	Button search;

	public void save() throws IOException, InterruptedException {
		UserRequest request = new UserRequest();
		request.username = userName.getText();
		request.email = email.getText();
		request.mobile = mobileNumber.getText();
		request.gender = gender.getText();
		request.password = password.getText();
		request.Confirm = confirmPassword.getText();

		String url = "http://localhost:8081/adduser/" + userId.getText();
		UserResponse response = RestUtils.PostRequest(url, request, UserResponse.class);
		if ("0000".equals(response.getResponseCode())) {
			errorMessage.setText("User Updated Sucessfully ");
			errorMessage.setTextFill(Color.GREEN);

		} else {
			errorMessage.setText("Update Failed ");
			errorMessage.setTextFill(Color.RED);

		}
	}
 
	public void cancle() {
		new UserManagement().show();
		System.out.println("cancle Button Clicked ");

	}

	public void search() throws IOException, InterruptedException  {
		UserRequest request = new UserRequest();
		String url = "http://localhost:8081/adduser/" + userId.getText();
		UserResponse response = RestUtils.getRequest(url, UserResponse.class);
		if (response != null) { 
			userName.setText(response.getUsername());
			email.setText(response.getEmail());
			mobileNumber.setText(response.getMobile());
			gender.setText(response.getGender());
			password.setText(response.getPassword());
			confirmPassword.setText(response.getConfirm());
			errorMessage.setText("User Found");
			errorMessage.setTextFill(Color.GREEN);
		} else {
			errorMessage.setText("User Not Found");
		    errorMessage.setTextFill(Color.RED);
	} 

} }