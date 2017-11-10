package com.deepak.collection;

import java.util.WeakHashMap;

class Employee {
	public Integer id;

	public Employee(Integer id) {
		this.id = id;
	}

	public void finalize() {
		System.out.println("finalize() method is call");
	}

	public String toString() {
		return " id=" + id + "  name";
	}

}

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		Employee emp1 = new Employee(111);
		Employee emp2 = new Employee(222);
		Employee emp3 = new Employee(333);

		/*HashMap hMap = new HashMap();
		hMap.put(emp1, "Deepak");
		hMap.put(emp2, "Dharam");
		hMap.put(emp3, "Chandu");
*/
		WeakHashMap wMap = new WeakHashMap();
		wMap.put(emp1, "Deepak");
		wMap.put(emp2, "Dharam");
		wMap.put(emp3, "Chandu");
		
		/*System.out.println("-----------HashMap-------------");
		System.out.println("Before Assign null to emp1");
		System.out.println(hMap.toString());
		System.out.println("After Assign null to emp1");
		emp1 = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(hMap);*/
		
		System.out.println("*********************************************************");
		
		System.out.println("-----------WeakHashMap-------------");
		System.out.println("Before Assign null to emp1");
		System.out.println(wMap.toString());
		System.out.println("After Assign null to emp1");
		emp2 = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(wMap);
	}
}
