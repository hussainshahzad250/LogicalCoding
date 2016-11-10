package Logical;

import java.util.Scanner;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int i,n,search,array[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element in array");
		n=sc.nextInt();
		array=new int[n];
		System.out.println("Inseart "+ n +" values n array");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter value to search in array");
		search=sc.nextInt();
		for(i=0;i<array.length;i++)
		{
			if(search==array[i])
			{
				System.out.println("Element found in "+(i+1)+" index");
				break;
			}
		
		}
		if(i==n)
		{
			System.out.println("Not found");
		}
	}
}
