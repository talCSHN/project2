package com.exam.dto;

import java.time.LocalDate;

public class CartDTO {

	int num;
	String ponum;
	String poname;
	String price;
	String period;
	String pt_count;
	int amount;
	LocalDate cart_date;
	
	public CartDTO() {}

	public CartDTO(int num, String ponum, String poname, String price, String period, String pt_count, int amount,
			LocalDate cart_date) {
		this.num = num;
		this.ponum = ponum;
		this.poname = poname;
		this.price = price;
		this.period = period;
		this.pt_count = pt_count;
		this.amount = amount;
		this.cart_date = cart_date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDate getCart_date() {
		return cart_date;
	}

	public void setCart_date(LocalDate cart_date) {
		this.cart_date = cart_date;
	}

	@Override
	public String toString() {
		return "CartDTO [num=" + num + ", ponum=" + ponum + ", poname=" + poname + ", price=" + price + ", period="
				+ period + ", pt_count=" + pt_count + ", amount=" + amount + ", cart_date=" + cart_date + "]";
	}
	
	
	
}
