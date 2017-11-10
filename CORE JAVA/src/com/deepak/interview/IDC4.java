package com.deepak.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IDC4 {

	public static void main(String[] args) {
		List<Suport> l = new ArrayList<Suport>();
		l.add(new Suport("C"));
		l.add(new Suport("A"));
		l.add(new Suport("D"));
		Collections.sort(l);
		System.out.println(l.get(0).code);
	}
}

class Suport implements Comparable<Suport> {
	String code;

	Suport(String c) {
		code = c;
	}

	public int compareTo(Suport f) {
		return this.code.compareTo(f.code);
	}
}
