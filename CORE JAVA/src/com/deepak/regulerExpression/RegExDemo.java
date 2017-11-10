package com.deepak.regulerExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("@gmail.com");
		Matcher m = p.matcher("fgsk1jhdj6xlDJg@678%&jmdERbflkaWlsv0sas");
		while (m.find()) {
			// System.out.println(m.start()+"...."+m.end()+"...."+m.group());
			System.out.println("correct");

		}

		// System.out.println("email id wrong");
	}
}
