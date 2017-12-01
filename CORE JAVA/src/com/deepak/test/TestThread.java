package com.deepak.test;
class MyThread extends Thread{
	public void run()
	{
		System.out.println("---Even Numbers----");
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{if(i%2==0)
			{
				System.out.println(i);
			}}
			notify();
		}
	}

	
}
public class TestThread {
public static void main(String[] args) throws InterruptedException {
	MyThread t=new MyThread();
	t.start();
	synchronized (t) {
		t.wait();
		System.out.println("----Odd Numbers---");
		for(int i=0;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
}
}
