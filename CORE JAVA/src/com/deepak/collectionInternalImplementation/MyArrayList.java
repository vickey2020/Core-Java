package com.deepak.collectionInternalImplementation;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> {
	private Object[] element;
	private int size = 0;
	private int capacity = 0;

	private static final int DEFUALT_CAPACITY = 10;

	public MyArrayList() {
		this(DEFUALT_CAPACITY);
	}

	public MyArrayList(int initCapacity) {
		capacity = initCapacity;
		element = new Object[capacity];
	}

	public boolean add(Object e) {
		if (size == capacity) {
			reallocate();
		}

		element[size] = e;
		++size;

		return true;
	}

	public void add(int index, Object e) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		if (size == capacity) {
			reallocate();
		}

		for (int i = size; i > index; i--) {
			element[i] = element[i - 1];
		}

		element[index] = e;
		size++;
	}

	public void clear() {
		element = new Object[capacity];
		size = 0;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MyArrayList list = (MyArrayList) o;

		if (size != list.size) {
			return false;
		}

		for (int i = 0; i < size; i++) {
			if (!element[i].equals(list.element[i])) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		return "MyArrayList [element=" + Arrays.toString(element) + "]";
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return element[index];
	}

	public int indexOf(Object o) {
		if (o == null) {
			throw new NullPointerException();
		}

		for (int i = 0; i < size; i++) {
			if (element[i].equals(o)) {
				return i;
			}
		}

		return -1;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		Object temp = element[index];

		for (int i = index + 1; i < size; i++) {
			element[i - 1] = element[i];
		}

		size--;
		return temp;
	}

	public boolean remove(Object o) {
		int indexOfO = indexOf(o);

		if (indexOfO == -1) {
			return false;
		}

		remove(indexOfO);
		return true;
	}

	public Object set(int index, E e) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		if (e == null) {
			throw new NullPointerException();
		}
		Object temp = element[index];
		element[index] = e;
		return temp;
	}

	public int size() {
		return size;
	}

	private void reallocate() {
		int newCapacity = capacity * 3 / 2 + 1;
		element = Arrays.copyOf(element, newCapacity);

	}

	public Iterator<E> iterator() {
		return iterator();
	}

	public static void main(String[] args) {
		MyArrayList l = new MyArrayList();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(2, 10);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		System.out.println(l);
	}
}
