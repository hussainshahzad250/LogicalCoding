package app1;

import java.util.Scanner;

public class PrimeNumberCount
{

	public static void main(String[] args)
	{
		int num=3,status=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many prime  number you want pls type ");
		int i = sc.nextInt();
		if(i>=1)
		{
			System.out.println("first " +i+ " numbers are ");
			System.out.println(2);
		}
		for(int count = 2; count<=i;)
		{
			for(int j=2;j<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{
					status=0;
					break;
				}
			}
			if(status !=0)
			{
				System.out.println(num);
				count++;
			}
			status =1;
			num++;
		
		}
	}

}
