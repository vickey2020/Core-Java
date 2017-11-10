package com.deepak.logical;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int row = 3, col = 4;
		int m1[][] = new int[3][4];
		int m2[][] = new int[4][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 2D matrix..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = sc.nextInt();
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose 2D matrix..");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				m2[i][j] = m1[j][i];
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}