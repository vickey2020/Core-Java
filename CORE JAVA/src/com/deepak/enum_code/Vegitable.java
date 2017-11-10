package com.deepak.enum_code;

public enum Vegitable {
	Pattao(20), Tomato(80), LadyFinger(30), Greencheeli(80), Onion(18), Mint(10), Brinjal;
	int price;

	Vegitable(int price) {
		this.price = price;
	}

	Vegitable() {
		this.price = 100;
	}

	public int getPrice() {
		return price;
	}

}
