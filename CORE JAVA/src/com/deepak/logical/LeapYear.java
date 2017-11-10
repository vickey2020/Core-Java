package com.deepak.logical;

public class LeapYear {
	public static boolean checkYear(int year) {
		boolean flag = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			flag = true;
		return flag;
	}

	public static void main(String[] args) {
		int year = 2000;
		boolean leap = checkYear(year);
		if (leap == true) {
			System.out.println("Your given year " + year + " is leap year");
		} else
			System.out.println("Your given year " + year + " is not leap year");

	}
}
