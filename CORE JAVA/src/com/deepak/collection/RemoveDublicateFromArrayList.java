package com.deepak.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateFromArrayList {
	/*-------Removing Duplicate object from List by using Set------*/
	public static Set<Object> uniqueArrayList1(List<Object> list) {
		Set<Object> set = new HashSet<Object>(list);
		return set;
	}

	/*-------Removing Duplicate object from List by using logic------*/

	public static List<Object> uniqueArrayList2(List<Object> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		List<Object> al = new ArrayList<Object>();

		al.add("java");
		al.add('a');
		al.add('b');
		al.add('a');
		al.add("java");
		al.add(10.3);
		al.add('c');
		al.add(14);
		al.add("java");
		al.add(12);

		/*----------Before Removing Duplicate elements--------*/

		System.out.println("Before Remove Duplicate elements:" + al);
		System.out.println("***************************************************");
		System.out.println("---Removing Duplicate object from List by using Set---");
		System.out.println(uniqueArrayList1(al));
		System.out.println("***************************************************");
		System.out.println("---Removing Duplicate object from List by using logic---");
		System.out.println(uniqueArrayList2(al));
	}
}