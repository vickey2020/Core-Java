package com.deepak.collection;

import java.util.ArrayList;
import java.util.List;

public class FindOutCommonObjectByTwoList {

	/*-----Retrieve common element among two List by retainAll() ----*/
	public static List<String> retrieveCommonObject(List<String> list1, List<String> list2) {
		list1.retainAll(list2);
		return list1;
	}

	/*-----Remove common element among two List by removeAll() ----*/
	public static List<String> removeCommonObject(List<String> list1, List<String> list2) {
		list1.removeAll(list2);
		return list1;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("a2");
		list1.add("seema");

		List<String> list2 = new ArrayList<String>();
		list2.add("b");
		list2.add("b2");
		list2.add("seema");

		System.out.println("-----Retrieve common element among two List by retainAll() ----");
		System.out.println(retrieveCommonObject(list1, list2));
		
		System.out.println("********************************************");
		
		System.out.println("-----Remove common element among two List by removeAll() ----");
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("a2");
		a.add("common");

		List<String> b = new ArrayList<String>();
		b.add("b");
		b.add("b2");
		b.add("common");
		
		System.out.println(removeCommonObject(a, b));
	}
}