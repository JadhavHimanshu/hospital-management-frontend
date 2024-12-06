package PatientManagement;

import CaseManagement.CaseManagement;
import addpatient.AddPatient;
import deletepatient.DeletePatient;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import searchpatient.SearchPatient;
import updatepatient.UpdatePatient;

public class PatientManagementController {
	@FXML
	Button addPatient;
	@FXML
	Button editPatient;
	@FXML
	Button searchPatient;
	@FXML
	Button deletePatient;
	@FXML
	Button addCasetButton;

	public void addPatient() {
		new AddPatient().show();

	}

	public void editPatient() { 
		 new UpdatePatient().show(); 

	}

	public void searchPatient() { 
		 new SearchPatient().show();

	}

	public void deletePatient() { 
		 new DeletePatient().show(); 
	}

	public void ClickOnCasetButton() {
		new CaseManagement().show();
	}

}
