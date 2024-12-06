package org.dnyanyog.dto;

public class CaseResponse {
	public String message;
	public String responseCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public CaseResponse(String message, String responseCode) {
		super();
		this.message = message;
		this.responseCode = responseCode;
	}

}
