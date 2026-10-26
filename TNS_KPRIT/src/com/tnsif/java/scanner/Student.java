package com.tnsif.java.scanner;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Name :"+name +",Id : "+id);
		System.out.println(sc.hasNext());
	}

}
