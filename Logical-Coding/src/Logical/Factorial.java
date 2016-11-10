package Logical;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find its factorial");
		do
		{
			int number= sc.nextInt();
			System.out.println("factorial of "+number+" is "+ Factorial(number));
			System.out.println("another no");
			sc.next();
			System.out.println("do u want one more?(y/n)");
			
		}
		while("y".equals(sc.next()));
		System.out.println("end of game");		
	}
	private static int Factorial(int number)
	{
		if(number==0)
		{
			return 1;
		}
		return number*Factorial(number-1);
	}	
}
/*private static int fact(int number)
{
	int result = 1;
	while(number !=0)
	{
		result = result*number;
		number--;
	}
	return result;
}*/

