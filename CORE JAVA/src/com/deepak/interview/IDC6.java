package com.deepak.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IDC6 implements Serializable {

	transient char x = 'd';

	public static void main(String[] args) {
		IDC6 t1 = new IDC6();
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("aa.txt"));
			os.writeObject(t1);
			os.close();
			System.out.println(++t1.x);
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("aa.txt"));
			IDC6 t2 = (IDC6) is.readObject();
			is.close();
			System.out.println(t2.x);
		} catch (Exception e) {
			System.out.println("aa");
		}
	}
}
