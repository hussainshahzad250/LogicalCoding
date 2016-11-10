package Logical;

import java.util.Scanner;

public class MultiplicationTable
{

	public static void main(String[] args)
	{
		int n, c;
		System.out.println("Enter an integer to print its table");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Multiplication table of "+n+" is");
		for(c=1;c<=10;c++)
			System.out.println(n+"*"+c+"="+(n*c));

	}

}
