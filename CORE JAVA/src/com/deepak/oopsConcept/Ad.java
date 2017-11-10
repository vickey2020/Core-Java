package com.deepak.oopsConcept;

public class Ad {

	public int fun(int i) {
		try {
			System.out.println("a" + i);
			return i;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("b" + i);
			return i;
		} finally {
			try {
				System.out.println("c" + i);
			} catch (Exception e) {
				System.out.println("d" + i);
			}
		}
	}

	public static void main(String[] args) {
		Ad ad = new Ad();
		ad.fun(10);
	}
}
