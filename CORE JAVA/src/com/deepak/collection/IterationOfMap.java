package com.deepak.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterationOfMap {
	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("Rahul", "Mona");
		m.put("D","meena");
		m.put("Monu","Seema");
		
		/*Iteration by forloop*/
		System.out.println("Iteration by forEachloop..........................");
		
		for(Map.Entry<String,String> entry:m.entrySet())
		{
			System.out.println("key: "+entry.getKey()+" , "+"Value: "+entry.getValue());
		}
		
		/*Itration by Iterator*/
		System.out.println("Itration by Iterator......................");
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println("Key: "+entry.getKey()+" , "+"Value: "+entry.getValue());
		}
				
	}
}
