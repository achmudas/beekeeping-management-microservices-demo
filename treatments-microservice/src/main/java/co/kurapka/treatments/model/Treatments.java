package co.kurapka.treatments.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "treatments")
public class Treatments {

	@Id
	private String id;

	private Boolean fromVaroa;
	private List<String> otherDiseases = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getFromVaroa() {
		return fromVaroa;
	}

	public void setFromVaroa(Boolean fromVaroa) {
		this.fromVaroa = fromVaroa;
	}

	public List<String> getOtherDiseases() {
		return otherDiseases;
	}

	public void setOtherDiseases(List<String> otherDiseases) {
		this.otherDiseases = otherDiseases;
	}

}
