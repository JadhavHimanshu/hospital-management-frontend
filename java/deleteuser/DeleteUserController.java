package deleteuser;

import java.io.IOException;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;

import UserManagement.UserManagement;
import common.RestUtils;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class DeleteUserController {
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
	TextField userId;
	@FXML
	Button search;
	@FXML
	Button delete;
	@FXML
	Button cancle;
	@FXML
	Label errorMessage;
	@FXML
	TextField username;

	public void search() throws IOException, InterruptedException {
		UserRequest request = new UserRequest();
		String url = "http://localhost:8081/adduser/" + userId.getText();
		UserResponse response = RestUtils.getRequest(url, UserResponse.class);
		if (response != null) {
			userName.setText(response.getUsername());
			email.setText(response.getEmail());
			mobileNumber.setText(response.getMobile());
			gender.setText(response.getGender());
			password.setText(response.getPassword());
			confirm.setText(response.getConfirm());
			errorMessage.setText("User Found");
			errorMessage.setTextFill(Color.GREEN);
		} else {
			errorMessage.setText("User Not Found");
			errorMessage.setTextFill(Color.RED);
		}

	}

	public void delete() throws IOException, InterruptedException {

		String url = "http://localhost:8081/adduser/" + userId.getText();
		UserResponse response = RestUtils.deleteRequest(url, UserResponse.class);
		if (response.getResponseCode().equals("0000")) {
			errorMessage.setText("User Deleted SucessFully");
			errorMessage.setTextFill(Color.GREEN);

		} else {
			errorMessage.setText("Failed To  Delete ");
			errorMessage.setTextFill(Color.RED);
		}

	}

	public void cancle() { 
		userId.clear();
		userName.clear();
		email.clear();
		mobileNumber.clear();
		gender.clear();
		password.clear();
		confirm.clear(); 
		 new UserManagement().show();

	}

}
