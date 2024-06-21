package com.exam.dto;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

@Alias("BuyGoodsDTO")
public class BuyGoodsDTO {

	String userid;
	String ponum;
	String poname;
	String price;
	String period;
	String pt_count;
	LocalDate cart_date;
	
	public BuyGoodsDTO() {}

	public BuyGoodsDTO(String userid, String ponum, String poname, String price, String period, String pt_count,
			LocalDate cart_date) {
		this.userid = userid;
		this.ponum = ponum;
		this.poname = poname;
		this.price = price;
		this.period = period;
		this.pt_count = pt_count;
		this.cart_date = cart_date;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPonum() {
		return ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
	}

	public String getPoname() {
		return poname;
	}

	public void setPoname(String poname) {
		this.poname = poname;
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

	public String getPt_count() {
		return pt_count;
	}

	public void setPt_count(String pt_count) {
		this.pt_count = pt_count;
	}

	public LocalDate getCart_date() {
		return cart_date;
	}

	public void setCart_date(LocalDate cart_date) {
		this.cart_date = cart_date;
	}

	@Override
	public String toString() {
		return "BuyGoodsDTO [userid=" + userid + ", ponum=" + ponum + ", poname=" + poname + ", price=" + price
				+ ", period=" + period + ", pt_count=" + pt_count + ", cart_date=" + cart_date + "]";
	}
	
	
	

	
	
	
	
	
}