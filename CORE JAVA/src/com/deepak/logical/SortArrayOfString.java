package com.deepak.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayOfString {
	public static List<String> sorting1(String arr) {
		String[] str = arr.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(str));
		Collections.sort(list);
		return list;
	}

	public static String[] sorting2(String arr) {
		String[] str = arr.split(" ");
		Arrays.sort(str);
		return str;
	}

	public static String[] sorting3(String arr) {
		String[] str = arr.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				/*
				 * if you want decending order then you replace > sign with <
				 * sign so your order of sorting will become decending
				 */
				String temp = null;
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "deepak dyna deepali deepika deksha dileep dee";
		System.out.println("Sort String array by Collections.sort() ");
		System.out.println(sorting1(str));
		System.out.println("****************************************");
		System.out.println("Sort String array by Arrays.sort() ");
		System.out.println(Arrays.toString(sorting2(str)));
		System.out.println("****************************************");
		System.out.println("sort String  array with using logic");
		System.out.println(Arrays.toString(sorting3(str)));

	}
}