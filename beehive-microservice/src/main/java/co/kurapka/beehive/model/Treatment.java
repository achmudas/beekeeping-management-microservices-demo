package co.kurapka.beehive.model;

import java.util.Date;

public class Treatment {

	private String treatmentId;
	private Date treatedOn;

	public String getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(String treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Date getTreatedOn() {
		return treatedOn;
	}

	public void setTreatedOn(Date treatedOn) {
		this.treatedOn = treatedOn;
	}

}
