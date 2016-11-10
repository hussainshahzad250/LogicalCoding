package Logical;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args)
	{
		System.out.println("please enter 3 digit number to find its armstrong numbers");
		/*int number = new Scanner(System.in).nextInt();*/
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(ArmStrong(number))//153
		{
			System.out.println("Number " + number + " is an ArmStrong Number");   
			
		}
		else
		{
			System.out.println("Number " + number + " is  not an ArmStrong Number");
			
		}
	}

	private static boolean ArmStrong(int number)
	{
		int result=0;
		int original=number;
		while(number !=0)
		{
			int rem = number%10;
			result = result+rem*rem*rem;
			number = number/10;
		}
		if(original==result)
		{
			return true;
		}
		return false;
	}
	
}
