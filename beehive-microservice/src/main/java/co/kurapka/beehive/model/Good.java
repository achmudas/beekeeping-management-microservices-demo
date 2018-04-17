package co.kurapka.beehive.model;

import java.util.Date;

public class Good {

	private String goodsId;
	private Date collectedOn;

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Date getCollectedOn() {
		return collectedOn;
	}

	public void setCollectedOn(Date collectedOn) {
		this.collectedOn = collectedOn;
	}

}
