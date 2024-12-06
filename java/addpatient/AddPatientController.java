package addpatient;

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

public class AddPatientController {
	@FXML
	TextField patient;
	@FXML
	TextField mobile;
	@FXML
	TextField gender;
	@FXML
	TextField birthdate;
	@FXML
	TextField examinationdate;
	@FXML
	TextField adress;
	@FXML
	Button save;
	@FXML
	Button cancle;
	@FXML
	Label errorMessage;

	public void save() throws IOException, InterruptedException {
		PatientRequest request = new PatientRequest();
		request.name = patient.getText();
		request.mobile = mobile.getText();
		request.gender = gender.getText();
		request.birthDate = birthdate.getText();
		request.examinationDate = examinationdate.getText();
		request.address = adress.getText();
		String url = "http://localhost:8081/addpatient";
		PatientResponse response = RestUtils.postRequest(url, request, PatientResponse.class);
		if ("0000".equals(response.getResponseCode())) {
			errorMessage.setText("Patient Added Sucessfully ");
			errorMessage.setTextFill(Color.GREEN);

		} else {
			errorMessage.setText("Failed ");
			errorMessage.setTextFill(Color.RED);
		}
	}

	public void cancle() {
		new PatientManagement().show();

	}

}
