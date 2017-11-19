package com.deepak.collectionInternalImplementation;

import java.util.Arrays;

public class MySingleLinkedList {
	int size = 0;
	Node head = null;
	Node tail = null;

	static class Node {
		Object data;
		Node next;

		public Object getData() {
			return data;
		}

		public Node(Object data) {
			this.data = data;
			next = null;
		}
	}

	public Node addAtStart(Object data) {
		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;

		++size;
		return newNode;
	}

	public Node addAtLast(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		++size;
		return newNode;
	}

	public Object getMiddileElement() {
		/*
		 * At initial point of time start and middle both are pointing head node
		 * only
		 */
		Node start = head;
		Node middle = head;
		int length = 0;
		while (start.next != null) {
			length++;
			// If start move 2 then middle move 1
			// so after complete iteration start goes last
			// and middle goes to middle of linked list
			if (length % 2 == 0) {
				middle = middle.next;
			}
			start = start.next;
		}

		return (Object) middle.getData();
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MySingleLinkedList list = new MySingleLinkedList();
		list.addAtLast("Deepak");
		list.addAtLast("123");
		list.addAtLast("ABC");
		list.addAtLast("Modi");

		list.print();

		Object o = list.getMiddileElement();
		System.out.println(String.valueOf(o));

		// Here we are trying to add object at start position of linked list
		list.addAtStart("1");
		list.addAtStart("2");

		// Again we are trying to iterate the linked list
		// That prove that object added at start position
		list.print();
	}
}
