package com.deepak.oopsConcept;

public class InterAB implements InterA{
	
	public void fun()
	{
		System.out.println("g");
		
	}
	
	
public static void main(String[] args)
{
	InterAB ab=new InterAB();
	ab.fun();
}
}
