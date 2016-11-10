package Logical;

import java.util.Scanner;

public class FloydTriangle
{
	public static void main(String[] args)
	{
		int n,num=1, c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of FloydTriangle you want");
		n =  sc.nextInt();
		System.out.println("Floyd's Triangle = ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}
}
