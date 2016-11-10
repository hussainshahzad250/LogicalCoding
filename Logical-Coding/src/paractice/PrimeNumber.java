package paractice;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer number");
		int num = sc.nextInt();
		int res = prime(num);
		System.out.println(res);
	}
	private static int prime(int num)
	{
		for(int i=1; i < num; i++)
		{
			boolean isPrime = true;
			for(int j=2; j< i ; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + " ");
			}
		}
		return num;		
	}
}
