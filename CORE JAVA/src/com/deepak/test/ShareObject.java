package com.deepak.test;

public class ShareObject {
	boolean flag=false;
	int num=0;
	char ch='A';
	public synchronized void printEven() throws InterruptedException
	{
		if(!flag)
		{
			if(num==0){
				
			}
			else{
			this.wait();
			}
		}
		System.out.println("even::"+(char)(ch+num++));
		flag=false;
		notify();
	}
	public synchronized void printOdd() throws InterruptedException
	{
		if(flag)
		{
			this.wait();
		}
		System.out.println("odd::"+(char)(ch+num++));
		flag=true;
		notify();
	}
}
 class PrintEven extends Thread{
	 int i = 0;
	 ShareObject so;
	 public PrintEven(ShareObject so) {
		 this.so=so;
	}
	 public void run()
	 {
		
		 while(i<13){
			 try {
				so.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 i++;
		 }
	 }
	 
 }
 class Printodd extends Thread{
	 int i=0;
	 ShareObject so;
	 Printodd(ShareObject so)
	 {
		 this.so=so;
		 
	 }
	 public void run(){
	while(i<13){
		try {
			so.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 }
 }