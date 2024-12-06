package org.dnyanyog.dto;

public class CaseRequest {
	public int id;
	public String name;
	public String caseNumber;
	public String symptons;
	public String fee;
	public String prescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getSymptons() {
		return symptons;
	}

	public void setSymptons(String symptons) {
		this.symptons = symptons;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

}
