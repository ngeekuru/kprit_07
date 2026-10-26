package com.tnsif.java.acessmodifiers.pack1;

public class sameClass {
			private int a =10;
			int b=20;
			protected int c = 30;
			public int d = 40;
	public static void main(String args[])
		{	
			sameClass sc = new sameClass();
			System.out.println(sc.a);
			System.out.println(sc.b);
			System.out.println(sc.c);
			System.out.println(sc.d);
			
		}
		
		
}
