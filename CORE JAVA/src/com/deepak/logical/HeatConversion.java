package com.deepak.logical;

public class HeatConversion {

	public static float heatTransmation(float c) {
		float f = 0;
		f = c * 9 / 5 + 32;
		return f;
	}

	public static void main(String[] args) {
		float c = 33;
		System.out.println("Celcious temparature " + c + " == " + heatTransmation(c)
		                      + " equivalent to forenhight");
	}
}
