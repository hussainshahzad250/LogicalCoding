package LogicalCoding;

import java.util.Scanner;

public class CompareTwoMin 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter first number");
		int i = sc.nextInt();
		System.out.println("enter second numbar");
		int j = sc.nextInt();
		if(i<j)
			System.out.println(i+ " is less than " +j);
		else
			System.out.println(j+ " is less than " + i);		
	}

}
