package searchpatient;

import java.io.IOException;

import org.dnyanyog.dto.PatientRequest;
import org.dnyanyog.dto.PatientResponse;

import PatientManagement.PatientManagement;
import common.RestUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchPatientController {
	@FXML
	TextField patientname;
	@FXML
	TextField mobile;
	@FXML
	TextField gender;
	@FXML
	TextField birthdate;
	@FXML
	TextField examinationDate;
	@FXML
	TextField address;
	@FXML
	TextField patientName;
	@FXML
	TextField patientID;
	@FXML
	Button search;
	@FXML
	Button cancle;
	@FXML
	Label errorMessage;

	public void search() throws IOException, InterruptedException { 
		PatientRequest request = new PatientRequest();
		String url = "http://localhost:8081/addpatient/" + patientID.getText();
		PatientResponse response = RestUtils.getRequest(url, PatientResponse.class);
		if (response != null) {
			patientname.setText(response.getName());
			mobile.setText(response.getMobile());
			gender.setText(response.getGender());
			birthdate.setText(response.getBirthDate());
			examinationDate.setText(response.getExaminationDate());
			address.setText(response.getAddress());

			errorMessage.setText("User Found");
			errorMessage.setTextFill(Color.GREEN);
		} else {
			errorMessage.setText("User Not Found");
			errorMessage.setTextFill(Color.RED);
		}



	}

	public void cancle() { 
		 new  PatientManagement().show();

	}

}
