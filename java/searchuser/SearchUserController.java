package searchuser;

import java.io.IOException;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;

import UserManagement.UserManagement;
import common.RestUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchUserController {
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
	TextField userId ;  
	 @FXML  
	 TextField Name ; 
	@FXML
	Label errorMessage;
	@FXML
	Button search;    
	 @FXML 
	  Button cancle ; 
	 
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
				confirmPassword.setText(response.getConfirm());
				errorMessage.setText("User Found");
				errorMessage.setTextFill(Color.GREEN);
			} else {
				errorMessage.setText("User Not Found");
			    errorMessage.setTextFill(Color.RED);
		} 
				  
			 } 
		   
public void cancle () {
	 new UserManagement().show();
}

		  
	 

}
