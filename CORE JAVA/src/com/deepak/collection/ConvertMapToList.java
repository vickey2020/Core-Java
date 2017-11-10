package com.deepak.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Deepak", 28);
		map.put("Ankit", 25);
		map.put("Abhilash", 26);
		map.put("Sumit", 25);
		Set<String> s = map.keySet();
		Set entry = map.entrySet();
		Collection<Integer> v = map.values();
		List<String> list = new LinkedList<>(s);
		Iterator<String> l = list.iterator();
		System.out.println("1 st way....");
		while (l.hasNext()) {
			System.out.println(l.next());
		}

		System.out.println("********************************************");
		System.out.println("2 nd way.............");

		List<Entry<String, Integer>> list1 = new LinkedList<>(entry);
		Iterator<Entry<String, Integer>> itr = list1.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> i = itr.next();
			System.out.println(i);
		}

	}
}
