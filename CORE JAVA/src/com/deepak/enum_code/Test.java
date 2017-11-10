package com.deepak.enum_code;

public class Test {
	public static void main(String[] args) {
		/* 1:- simple approch */
		Month m = Month.april;
		System.out.println(m);
		System.out.println("***********************************************");
		/* enum by switch */
		switch (m) {
		case january:
			System.out.println("it is january");
			break;
		case february:
			System.out.println("it is february");
			break;
		case march:
			System.out.println("it is march");
			break;
		case april:
			System.out.println("it is april");
			break;
		case may:
			System.out.println("it is may");
			break;
		case june:
			System.out.println("it is june");
			break;
		case july:
			System.out.println("it is july");
			break;
		case august:
			System.out.println("it is august");
			break;
		case september:
			System.out.println("it is september");
			break;
		case october:
			System.out.println("it is october");
			break;
		case november:
			System.out.println("it is november");
			break;
		case december:
			System.out.println("it is december");
			break;

		}

		/* by values() method of Enum class */
		System.out.println("**********************************");
		Month[] m1 = Month.values();
		for (Month m2 : m1) {
			System.out.println(m2 + "....." + m2.ordinal());
		}

		/* by constractor */
		System.out.println("*****************************************");
		Vegitable[] v = Vegitable.values();
		for (Vegitable v1 : v) {
			System.out.println(v1 + "......" + v1.getPrice());
		}

	}
}
