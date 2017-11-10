package com.deepak.logical;

public class Armstrong {
	public static int isArmstrong(int num) {
		int temp = num, rem = 0;
		int arm = 0;
		int count = 0;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			arm = arm + power(count, rem);
			temp = temp / 10;
		}
		return arm;
	}

	private static int power(int count, int rem) {
		int arm = 1;
		for (int i = 1; i <= count; i++) {
			arm = arm * rem;
		}
		return arm;
	}

	public static void main(String[] args) {
		int num = 153;
		int arm = isArmstrong(num);
		if (arm == num) {
			System.out.println("Given number " + num + " is armstrong number");
		} else
			System.out.println("Given number " + num + " is not armstrong number");

	}
}
