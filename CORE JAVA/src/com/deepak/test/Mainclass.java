package com.deepak.test;

public class Mainclass {
	public static void main(String[] args) {
  ShareObject so=new ShareObject();
  PrintEven pe=new PrintEven(so);
  Printodd po=new Printodd(so);
  pe.start();
  po.start();
	}
}
