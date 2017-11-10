package com.deepak.logical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	/*---------Convert Date to String-------*/
	/* there are some date format:-"dd-MMM-yyyy" ; "dd-MMMM-yyyy" */
	public static String dateToString() {
		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MMMM-yyyy");
		String strDate = fmt.format(date);
		return strDate;
	}

	/*---------Convert String to Date-------*/
	public static Date stringToDate() {
		Date dd = new Date();
		SimpleDateFormat formt = new SimpleDateFormat("dd-MM-yyyy");
		String stDate = formt.format(dd);
		Date dt = null;
		try {
			dt = formt.parse(stDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dt;
	}

	public static void main(String[] args) {

		System.out.println(dateToString());
		System.out.println("*************************************");
		System.out.println(stringToDate());
	}
}
