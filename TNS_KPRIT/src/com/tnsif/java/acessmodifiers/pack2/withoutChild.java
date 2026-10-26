package com.tnsif.java.acessmodifiers.pack2;

import com.tnsif.java.acessmodifiers.pack1.sameClass;

public class withoutChild {
	public static void main(String args[])
	{
		sameClass s = new sameClass();
		//withoutChild w1 = new withoutChild();
		//System.out.println(w1.a);
		//System.out.println(w1.b);
		//System.out.println(w1.c);
		System.out.println(s.d);
	}
}
