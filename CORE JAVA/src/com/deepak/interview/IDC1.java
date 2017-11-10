package com.deepak.interview;

class Super{
	public Long getLength()
	{
		return new Long(4);
	}
}
public class IDC1 extends Super {

	public Long getLength(){
		return new Long(5);
	}
	
	public static void main(String[] args) {
		Super s=new Super();
		IDC1 i=new IDC1();
		System.out.println(s.getLength().toString()+" , "+i.getLength().toString());
	}
}