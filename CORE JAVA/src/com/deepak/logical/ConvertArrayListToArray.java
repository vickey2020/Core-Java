package com.deepak.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		list1.add("array");
		list1.add("arraylist");
		list1.add("convertion");
		list1.add("javaprogram");
		String[] str = list1.toArray(new String[list1.size()]);
		System.out.println(Arrays.toString(str));

		System.out.println("*****************************************************");
		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);

		// Object[] inter = list2.toArray();
		Integer[] inter = list2.toArray(new Integer[list2.size()]);
		for (int i = 0; i < inter.length; i++) {
			int itr = inter[i];
			System.out.print(itr + " ");
		}

	}
}
