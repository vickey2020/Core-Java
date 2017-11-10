package com.deepak.interview;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IDC10 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(new Integer(2));
		l.add(new Integer(8));
		l.add(new Integer(5));
		l.add(new Integer(1));
		Iterator i = l.iterator();
		Collections.reverse(l);
		Collections.reverse(l);
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}

	}
}
