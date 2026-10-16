package com.tnsif.java.intro;

public class conditionalStmts {

	public static void main(String[] args) {
		// if statement
		int num = 23;
		if(num>0)
		{
			System.out.println("num is positive");
		}
		
		/* comment line for multiple lines */
		
		int age = 9;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Not Eligible ");
		}
		
		//else if
		
		int marks = 65;
		if(marks>=90 && marks<=100)   //90-100
		{
			System.out.println("A grade");
		}
		else if(marks<90 && marks>=80)  //80-89
		{
			System.out.println("B grade");
		}
		else if(marks<80 && marks>=70)  //70-79
		{
			System.out.println("C grade");
		}
		else if(marks<70 && marks>=35)  //70-79
		{
			System.out.println("D grade");
		}
		else if(marks<35 && marks>=0)  //0-34
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter valid number");
		}
		
		//Switch statement
		
		char input = 'h';
		
		switch(input) {
		case 'a' : System.out.println("a is vowel"); break;
		case 'e' : System.out.println("e is vowel"); break;
		case 'i' : System.out.println("i is vowel"); break;
		case 'o' : System.out.println("o is vowel"); break;
		case 'u' : System.out.println("u is vowel"); break;
		default : System.out.println("Enter valid character");
		}
		

	}

}
