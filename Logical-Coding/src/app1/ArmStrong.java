package app1;

import java.util.Scanner;

public class ArmStrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 digit number");
		int number = sc.nextInt();
		if(ArmStrong(number))
		{
			System.out.println("number is armStrong");
		}
		else
		{
			System.out.println("number is not armStrong");
		}
	}

	private static boolean ArmStrong(int number)
	{
		int result=0;
		int original = number;
		while(number != 0)
		{
			int remainder = number%10;
			result = result + remainder*remainder*remainder;
			number = number/10;
		}
		if(original ==result)
		{
			return true;
		}
		return false;
	}
}
