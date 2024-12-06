package UserManagement;

import CaseManagement.CaseManagement;
import PatientManagement.PatientManagement;
import adduser.AddUser;
import appointment.AppointmentManagement;
import common.ScreenCommon;
import deleteuser.DeleteUser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.Login;
import searchuser.SearchUser;
import updateuser.UpdateUser;

public class UserManagementController {
	@FXML
	Button addUser;
	@FXML
	Button editUser;
	@FXML
	Button deleteUser;
	@FXML
	Button searchUser;
	@FXML
	Button patient;
	@FXML
	Button Case;
	@FXML
	Button appointment;
	@FXML
	Button user;
	@FXML
	Button logout;

	public void addUser() {
		new AddUser().show();

	}

	public void editUser() {
		new UpdateUser().show();

	}

	public void searchUser() {
		new SearchUser().show();

	}

	public void deleteUser() {
		new DeleteUser().show();
	}

	public void patient() { 
		 new PatientManagement().show() ; 

	}

	public void Case() {  
		  new CaseManagement().show(); 

	}

	public void appointment() { 
		 new AppointmentManagement().show() ;

	}

	public void user() { 
		 new UserManagement().show(); 

	}

	public void logout() { 
		 new Login().show(); 

	} 
	 
}
