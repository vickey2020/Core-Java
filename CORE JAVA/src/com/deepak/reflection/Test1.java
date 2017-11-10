package com.deepak.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Employee1 implements java.io.Serializable, Cloneable {
	public int eNumber;
	public static String eName;
	public String eAddress;

	public Employee1() {
	}

	public Employee1(int eNumber, String eName, String eAddress) {
	}

	public void add(int eNumber, String eName, String eAddress) throws RuntimeException,ArithmeticException{
	}

	public void search(int eno)throws NullPointerException {
	}
}

public class Test1 {
	public static void main(String[] args) {
		String e = new String();
		Class c = e.getClass();
		System.out.println("---------All information releted to class----------");
		System.out.println("===================================================");

		System.out.println("                   Name of Class       ");
		System.out.println("Class Name :: " + c.getName());
		System.out.println("****************************************************");

		System.out.println("               Name fo Super Class");
		System.out.println("Super Class Name :: " + c.getSuperclass().getName());
		System.out.println("*****************************************************");

		System.out.println("               All Interfaces List ");
		Class[] inter = c.getInterfaces();
		for (Class i : inter) {
			System.out.println("Interface Name :: " + i.getName());
		}
		System.out.println("*******************************************************");

		System.out.println("               All Access Modifiers");
		int mod = c.getModifiers();
		System.out.println(Modifier.toString(mod));
		System.out.println("*******************************************************");

		System.out.println("               All Constructor List");
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor cust : cons) {
			System.out.println("Constructor Name :: " + cust.getName() + " && List of the arguments ::"
					+ Arrays.toString(cust.getParameterTypes()));
		}
		System.out.println("*********************************************************");

		System.out.println("                All Methods List");
		Method[] method = c.getDeclaredMethods();
		System.out.println("all methods in String count : "+method.length);
		for (Method m : method) {
			System.out.println("Method Name :: " + m.getName() + " && List of the arguments :: "
					+ Arrays.toString(m.getParameterTypes()) + " && return type :: " + m.getReturnType()
					+" &&  ExceptionType :: "+Arrays.toString(m.getExceptionTypes()));
		}
		System.out.println("**********************************************************");

		System.out.println("               All Fields List");
		Field[] field = c.getDeclaredFields();
		for (Field f : field)

		{
			System.out.println("Field Name :: " + f.getName() + " && Type :: " + f.getType() 
			+ " & AccessModifier :: "+Modifier.toString(f.getModifiers()) );
		}

	}
}
