package com.deepak.logical;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void random1() {
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(1000);

		// Print random integers
		System.out.println("Random Integers: " + rand_int1);

		// Generate Random doubles
		double rand_dub1 = rand.nextDouble();

		// Print random doubles
		System.out.println("Random Doubles: " + rand_dub1);

	}

	public static void random2()

	{ // Generating random doubles
		System.out.println("Random doubles: " + Math.random());

	}

	public static void random3() {
		// Generate random integers in range 0 to 999
		int rand_int1 = ThreadLocalRandom.current().nextInt();

		// Print random integers
		System.out.println("Random Integers: " + rand_int1);

		// Generate Random doubles
		double rand_dub1 = ThreadLocalRandom.current().nextDouble();

		// Print random doubles
		System.out.println("Random Doubles: " + rand_dub1);

		// Generate random booleans
		boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean();

		// Print random Booleans
		System.out.println("Random Booleans: " + rand_bool1);

	}

	public static void main(String[] args) {
		// using java.util.Random;
		random1();
		// 2) Math.random()
		System.out.println("*********************************************");
		random2();
		// 3) java.util.concurrent.ThreadLocalRandom class
		System.out.println("**************************************************");
		random3();
	}
}