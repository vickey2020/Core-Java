package com.deepak.java8Features;

public interface Phone {
	void call();

	default void massage() {
		System.out.println("sent");
	}
}
