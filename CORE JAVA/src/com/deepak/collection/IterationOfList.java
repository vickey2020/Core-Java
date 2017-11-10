package com.deepak.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationOfList {
	public static void main(String[] args) {
		List a=new ArrayList();
		a.add("deepak");
		a.add("moham");
		a.add(5);
		a.add('c');
		System.out.println("size of list : " +a.size());

	   /*Iteration by for loop*/
		System.out.println("1:-Iteration by for loop...............");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		/*teration by for each loop*/
		System.out.println("2:-Iteration by for each loop......................");
		for(Object o:a)
		{
			System.out.println(o);
		}
		/*Iteration by Iterator*/
		System.out.println("3:-Iteration by Iterator........................");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*Iteartion by ListIterator*/
		System.out.println("4:-Iteartion by ListIterator......................");
		ListIterator ltr=a.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		/*Iteartion By while loop*/
		System.out.println("5:-Iteartion By while loop.....................");
		int i=0;
		while(i<a.size())
		{
			System.out.println(a.get(i));
			i++;
		}
		}
}
