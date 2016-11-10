package app1;

import java.util.Scanner;

public class MultificationTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of which you want multiplication table");
		int i = sc.nextInt();
		System.out.println("multiplication of " +i+ " is as ");
		for(int j=1;j<=10;j++)
		{
			System.out.println(i + "*" + j+ "= " +(i*j));
		}
	}

}
