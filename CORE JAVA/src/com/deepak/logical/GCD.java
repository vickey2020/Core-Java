package com.deepak.logical;

public class GCD {
	public static int gcd(int n1, int n2, int n3) {
		int smallest = 0, num = 0;
		smallest = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
		for (int i = smallest; i > 0; i--) {
			if (n1 % i == 0 && n2 % i == 0 && n3 % i == 0) {
				num = i;
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int n1 = 35;
		int n2 = 21;
		int n3 = 14;
		System.out.println("Greatest common devision number is :: " + gcd(n1, n2, n3));
	}
}