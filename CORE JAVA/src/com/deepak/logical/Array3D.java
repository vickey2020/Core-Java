package com.deepak.logical;

public class Array3D {

	public static void main(String[] args) {
		int[][][] a = new int[2][3][3];
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;
		a[0][1][0] = 40;
		a[0][1][1] = 50;
		a[0][1][2] = 60;
		a[0][2][0] = 70;
		a[0][2][1] = 80;
		a[0][2][2] = 90;
		a[1][0][0] = 100;
		a[1][0][1] = 110;
		a[1][0][2] = 120;
		a[1][1][0] = 130;
		a[1][1][1] = 140;
		a[1][1][2] = 150;
		a[1][2][0] = 160;
		a[1][2][1] = 170;
		a[1][2][2] = 180;
		System.out.println("Matrix representation of 3D");
		System.out.println("By for loop");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print("\t" + a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("**************************************");
		System.out.println("By for each loop");
		for (int a1[][] : a) {
			for (int a2[] : a1) {
				for (int a3 : a2) {
					System.out.print("\t" + a3);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}