package com.exam.dto;

import org.apache.ibatis.type.Alias;

@Alias("GoodsDTO")
public class GoodsDTO {

	String ponum;
	String category;
	String price;
	String period;
	int pt_count;
	String image;
	
	public GoodsDTO() {}

	public GoodsDTO(String ponum, String category, String price, String period, int pt_count, String image) {
		this.ponum = ponum;
		this.category = category;
		this.price = price;
		this.period = period;
		this.pt_count = pt_count;
		this.image = image;
	}

	public String getPonum() {
		return ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getPt_count() {
		return pt_count;
	}

	public void setPt_count(int pt_count) {
		this.pt_count = pt_count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "GoodsDTO [ponum=" + ponum + ", category=" + category + ", price=" + price + ", period=" + period
				+ ", pt_count=" + pt_count + ", image=" + image + "]";
	}
	
	
	
}
