package com.deepak.test;

class AB
{
	public void fun()
	{
		System.out.println("B");
	}
}
class BA extends AB
{
	public void fun()
	{
		System.out.println("A");
	}
}
public class Practice3 {
	public static void main(String[] args) {
		Object obj=new AB();
		
	}

}
