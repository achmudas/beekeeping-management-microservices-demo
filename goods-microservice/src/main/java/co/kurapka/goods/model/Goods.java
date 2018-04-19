package co.kurapka.goods.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goods")
public class Goods {

	@Id
	private String id;

	private Integer litersOfHoney;
	private Integer kgsOfWax;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLitersOfHoney() {
		return litersOfHoney;
	}

	public void setLitersOfHoney(Integer litersOfHoney) {
		this.litersOfHoney = litersOfHoney;
	}

	public Integer getKgsOfWax() {
		return kgsOfWax;
	}

	public void setKgsOfWax(Integer kgsOfWax) {
		this.kgsOfWax = kgsOfWax;
	}

}
