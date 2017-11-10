package com.deepak.test;

class Dog extends Animal {

	int i;

	public Dog(int i) {
		this.i = i;
	}

	public void eat() {
		System.out.println("Dog " + i + " is eating");
	}
}

public class Animal {

	public void eat() {
		System.out.println("Animal is eating");
	}

	public static void main(String[] args) {
		Object object = new Object();
		Object animal = new Animal();
		Animal dog1 = new Dog(1);
		Object dog2 = new Dog(2);

		callEat(object);
		callEat(animal);
		callEat(dog1);
		callEat(dog2);
	}

	public static void callEat(Object ref) {
		if (ref instanceof Animal) {
			System.out.println("animal");
			Animal a = (Animal) ref;
			a.eat();
		}
		System.out.println("++++++++++++++++++++++++++++++");
		if (ref instanceof Dog) {
			System.out.println("dog");
			Dog a = (Dog) ref;
			a.eat();
		}
	}
}