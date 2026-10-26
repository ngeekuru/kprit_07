package com.tnsif.java.acessmodifiers.pack2;

import com.tnsif.java.acessmodifiers.pack1.sameClass;

public class withChild extends sameClass{
	public static void main(String args[])
	{
		withChild wc = new withChild();
		System.out.println(wc.c);
		
		
		sameClass d2 = new sameClass();
		//System.out.println(d2.a);
		//System.out.println(d2.b);
		//System.out.println(d2.c);
		System.out.println(d2.d);
	}
}
