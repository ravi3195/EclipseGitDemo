package org.ravi.callbyvalue;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Sum of two numbers");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a= sc.nextInt();
		
		System.out.println("Enter second numbers");
		int b= sc.nextInt();
		int c=a+b;
		
		System.out.println("Sum of a and b is: "+c);
		
	}

}
