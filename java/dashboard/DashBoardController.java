package dashboard;

import java.io.IOException;

import CaseManagement.CaseManagement;
import PatientManagement.PatientManagement;
import UserManagement.UserManagement;
import appointment.AppointmentManagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DashBoardController {

	@FXML
	private Button addPatientButton;
	@FXML
	private Button addCaseButton;
	@FXML
	private Button addAppointmentButton;
	@FXML
	private Button addUserButton;

	@FXML
	private Button logoutButton;

	public void ClickOnPatientButton() { 
		System.out.println(" Add Patient Button Clicked ");
         new PatientManagement().show();
	}

	public void ClickOnCasetButton() {
		System.out.println(" Add  Case Button Clicked ");
           new CaseManagement().show();
      }

	public void ClickOnAppointmentsButton() {
     System.out.println(" Add Appointments Button Clicked ");
		new AppointmentManagement().show(); 
		}

	public void ClickOnUserButton() { 
		 System.out.println("Add User Button Clicked ")  ; 
		new UserManagement().show();

	}
 
	public void ClickOnLogoutButton() {
		System.out.println(" Exit Application "); 
		 

	}

}
