package com.deepak.interview;

public class IDC3 {

	public static void main(String[] args) {
		try {
			methodCheck();
			System.out.println("A");
		} catch (RuntimeException re) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} catch (Throwable e) {
			System.out.println("T");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}

	public static void methodCheck() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
