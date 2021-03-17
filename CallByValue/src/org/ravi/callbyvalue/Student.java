package org.ravi.callbyvalue;

public class Student 
{
	public int marks=0;
	
	public void getMarks(Student student)
	{
		student.marks= 95;
		System.out.println("Marks Student= "+student.marks);
	}

	public static void main(String[] args) 
	{
		Student s1= new Student();
		int mark1;
		s1.marks=97;
		s1.getMarks(s1);
		
		System.out.println("Marks S1= "+s1.marks);
		
	}

}
