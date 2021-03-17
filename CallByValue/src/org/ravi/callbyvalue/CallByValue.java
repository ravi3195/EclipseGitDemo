package org.ravi.callbyvalue;

public class CallByValue 
{
	public static void changeValue(int num1, int num2)
	{
		int AA = num1+1;
		int BB= num2+2;
		System.out.println(AA);
		System.out.println(BB);
		
	}
	public static void main(String[] args) 
	{
		int A=10;
		int B=20;
		
		CallByValue.changeValue(A,B);
		
		System.out.println(A);
		System.out.println(B);
	}

}
