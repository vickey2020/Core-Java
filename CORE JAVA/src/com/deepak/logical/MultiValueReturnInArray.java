package com.deepak.logical;

public class MultiValueReturnInArray {

	int mul; // To store multiplication
	double div; // To store division

	MultiValueReturnInArray(int m, double d) {
		mul = m;
		div = d;
	}

	static int[] getSumAndSub(int a, int b) {
		int[] ans = new int[2];
		ans[0] = a + b;
		ans[1] = a - b;

		// returning array of elements
		return ans;
	}

	static MultiValueReturnInArray getMultandDiv(int a, int b) {
		// Returning multiple values of different
		// types by returning an object
		return new MultiValueReturnInArray(a * b, (double) a / b);
	}

	// Driver method
	public static void main(String[] args) {
		/* If all returned elements are of same type */
		int[] ans = getSumAndSub(100, 50);
		System.out.println("Sum = " + ans[0]);
		System.out.println("Sub = " + ans[1]);

		System.out.println("*******************************************");
		/* If returned elements are of different types */
		MultiValueReturnInArray ans1 = getMultandDiv(10, 20);
		System.out.println("Multiplication = " + ans1.mul);
		System.out.println("Division = " + ans1.div);
	}
}
