package com.deepak.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UpdateDb {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> srNames = new ArrayList<String>();
		srNames.add("ray");
		srNames.add("srivastava");
		srNames.add("mishra");
		map.put("Rakesh", srNames);
		Set<String> mapKeys = map.keySet();
		for (String firstName : mapKeys) {
			List<String> lastNames = map.get(firstName);
			for (String lastName : lastNames) {
				// find data from first table using firstName,lastName
				int id = findByCriteria(firstName, lastName);
				// update the above id in table 2 for the firstName and lastName
				updateByCriteria(firstName, lastName, id);
			}
		}
	}

	private static void updateByCriteria(String firstName, String lastName, int id) {
		// update the table id for the firstName and lastName for the
		// corresponding id

	}

	private static int findByCriteria(String firstName, String lastName) {
		// do logical calculation and get id same id need to be return

		return 0;
	}

}
