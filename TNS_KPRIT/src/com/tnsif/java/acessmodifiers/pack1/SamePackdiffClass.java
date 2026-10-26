package com.tnsif.java.acessmodifiers.pack1;

public class SamePackdiffClass {
	public static void main(String args[])
	{
		sameClass d1 = new sameClass();
		//System.out.println("private"+d1.a);
		System.out.println("Default"+d1.b);
		System.out.println("Protected"+d1.c);
		System.out.println("Public"+d1.d);
		
	}
}
