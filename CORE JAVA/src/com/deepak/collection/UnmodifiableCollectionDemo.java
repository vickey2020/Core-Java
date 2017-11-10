package com.deepak.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnmodifiableCollectionDemo {
	 public static void main(String[] args) {
		   // create array list
		   List<Character> list = new ArrayList<Character>();
		   Set<Character> set=new HashSet();
		   set.add('a');
		   set.add('b');
		      
		   // populate the list
		   list.add('X');
		   list.add('Y');
		      
		   System.out.println("Initial list: "+ list);
		   System.out.println("Initial set: "+ set);
		      
		   Collection<Character> immutablelist = Collections.unmodifiableCollection(list);
		   Collection<Character> immutableSet = Collections.unmodifiableCollection(set);
		      
		   // try to modify the list
		   immutablelist.add('Z');      
		   }
}
