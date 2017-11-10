package com.deepak.logical;

import java.util.Scanner;

public class FindNumberOfNoteOfEnterAmount {

	public static void main(String[] args) {
		long amount;
		int currencyNote, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		amount = sc.nextLong();
		System.out.println("Enter Currency Note whatever you want mulitiple of that currency note");
		currencyNote = sc.nextInt();
		System.out.println("Given amount " + amount + " is coverted into Indian Currency Notes...");
		switch (currencyNote) {
		case 1000: {
			n = (int) (amount / 1000);
			amount = (int) (amount % 1000);
			if (n > 0) {
				System.out.println("1000rs notes ::" + n);
			}
		}
		case 500: {
			n = (int) (amount / 500);
			amount = (int) (amount % 500);
			if (n > 0) {
				System.out.println("500rs notes  ::" + n);
			}
		}
		case 100: {
			n = (int) (amount / 100);
			amount = (int) (amount % 100);
			if (n > 0) {
				System.out.println("100rs notes  ::" + n);
			}
		}
		case 50: {
			n = (int) (amount / 50);
			amount = (int) (amount % 50);
			if (n > 0) {
				System.out.println("50rs notes   ::" + n);
			}
		}
		case 10: {
			n = (int) (amount / 10);
			amount = (int) (amount % 10);
			if (n > 0) {
				System.out.println("10rs notes   ::" + n);
			}
		}
		case 5: {
			n = (int) (amount / 5);
			amount = (int) (amount % 5);
			if (n > 0) {
				System.out.println("5rs notes    ::" + n);
			}
		}
		case 2: {
			n = (int) (amount / 2);
			amount = (int) (amount % 2);
			if (n > 0) {
				System.out.println("1rs notes    ::" + n);
			}
		}
		default:
			break;
		}
		sc.close();
	}
}