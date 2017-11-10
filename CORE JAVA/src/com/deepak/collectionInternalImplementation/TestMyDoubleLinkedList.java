package com.deepak.collectionInternalImplementation;

public class TestMyDoubleLinkedList {
	public static void main(String[] args) {
		MyDoubleLinkedList md = new MyDoubleLinkedList();
		md.createNode(10);
		md.createNode(20);
		md.createNode(30);
		md.createNode(40);

		md.iterate();
	}
}

class MyDoubleLinkedList {
	Element front, last;

	public void createNode(Object data) {
		Element e = new Element();
		e.data = data;
		if (front == null)
			front = e;
		else {
			last.next = e;
			e.pre = last;
		}
		last = e;
	}

	public void iterate() {
		Element e = front;
		while (e != null) {
			System.out.println(e.data);
			e = e.next;
		}
	}
}

class Element {
	public Element pre, next;
	Object data;
}
