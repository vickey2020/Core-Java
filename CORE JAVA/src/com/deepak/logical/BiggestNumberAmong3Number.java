package com.deepak.logical;

public class BiggestNumberAmong3Number {

	public static int biggestNumber(int n1, int n2, int n3) {
		return (n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3));
	}

	public static void main(String[] args) {
		int n1 = 19;
		int n2 = 20;
		int n3 = 1;
		System.out.println("Biggest number among 3 number is :: " + biggestNumber(n1, n2, n3));
	}
}
