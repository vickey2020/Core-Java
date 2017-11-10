package com.deepak.logical;

import java.util.Scanner;

public class Matrix2DAddition {

	public static void main(String[] args) {
		int row = 3, col = 4;
		int[][] m1 = new int[3][4];
		int[][] m2 = new int[3][4];
		int[][] m3 = new int[3][4];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = sc.nextInt();
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter Second Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m2[i][j] = sc.nextInt();
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("****************************************");
		System.out.println("Display Addition of Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
