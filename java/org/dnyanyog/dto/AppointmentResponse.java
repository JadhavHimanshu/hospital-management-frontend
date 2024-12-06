package org.dnyanyog.dto;

public class AppointmentResponse {
	public String message;
	public String ResponseCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public AppointmentResponse(String message, String responseCode) {
		super();
		this.message = message;
		ResponseCode = responseCode;
	}

}
