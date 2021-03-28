package org.ravi.callbyvalue.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLaptop 
{

	public static void main(String[] args) 
	{
		List<Laptop> lapList= new ArrayList<>();
		Laptop lap1=new Laptop("Dell",16,75000,"1 TB");
		Laptop lap2=new Laptop("Apple",8,125000,"128 GB");
		Laptop lap3=new Laptop("Lenovo",16,71000,"1 TB");
		Laptop lap4=new Laptop("HP",8,45000,"516 GB");
		
		lapList.add(lap1);
		lapList.add(lap2);
		lapList.add(lap3);
		lapList.add(lap4);
		
		Comparator<Laptop> com = new Comparator<Laptop>()
				{
					@Override
					public int compare(Laptop lap1, Laptop lap2) 
					{
						// this>lap2 +ve number, this< lap2 -ve number, if equal then return )
						if(lap1.getRam()> lap2.getRam())
							return 1;
						else if(lap1.getRam()< lap2.getRam())
							return -1;
						else 
							return 0;
					}
				};
			
		 
		Collections.sort(lapList, com);
		
		for(Laptop lap: lapList)
		{
			System.out.println(lap);
		}

	}

}
