package java_fundamental;

import java.util.Scanner;

public class KissPrinciple 
{
	/*  This is violating KISS principle
	private static String getMonth(int key)
	{
		switch (key) 
		{
			case 1:
				return "january";
			case 2:
				return "february";
			case 3:
				return "march";
			case 4:
				return "april";
			case 5:
				return "may";
			case 6 :
				return "june";
			case 7:
				return "july";
			case 8: 
				return "august";
			case 9: 
				return "september";
			case 10:
				return "october";
			case 11:
				return "november";
			case 12: 
				return "december";
			default :
				return "invalid argument";
		}
	}
	*/
	
	private static String getMonth(int month)
	{
		if((month<1)||(month>12))
		{
			throw new IllegalArgumentException("Month must be between 1-12");
		}
		else
		{
			String months[]= {"january","february","march","april","may","june","juy","august","september","october","november","december"};
			return months[month-1];
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number = sc.nextInt();
		System.out.println("Month is : "+getMonth(number));
		sc.close();
	}
}