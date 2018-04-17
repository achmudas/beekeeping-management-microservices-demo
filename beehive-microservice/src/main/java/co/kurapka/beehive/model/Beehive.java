package co.kurapka.beehive.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beehives")
public class Beehive {

	@Id
	private String id;

	private Integer number;
	private Integer numberOfRams;
	private Integer queenAge;

	private List<Good> goods = new ArrayList<>();
	private List<Treatment> treatments = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumberOfRams() {
		return numberOfRams;
	}

	public void setNumberOfRams(Integer numberOfRams) {
		this.numberOfRams = numberOfRams;
	}

	public Integer getQueenAge() {
		return queenAge;
	}

	public void setQueenAge(Integer queenAge) {
		this.queenAge = queenAge;
	}

	public List<Good> getGoods() {
		return goods;
	}

	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}

	public List<Treatment> getTreatmen() {
		return treatments;
	}

	public void setTreatmen(List<Treatment> treatmen) {
		this.treatments = treatmen;
	}

}
