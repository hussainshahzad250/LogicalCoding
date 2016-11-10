package Logical;

import java.util.Scanner;

public class EvenOddTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter any Number = ");
			int number = sc.nextInt();
			if((number % 2)==0)
			{
				System.out.printf("Number %d is even number %n", number);
			} 
			else
			{
				System.out.printf("Number %d is odd number %n", number);
			}
			System.out.println("if you want to check one more number (y/n)");
		}
		while("y".equals(sc.next()));
		System.out.println("done");
	}		
}


