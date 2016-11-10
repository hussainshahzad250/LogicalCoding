package app2;

import java.util.Scanner;

public class D
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String s1 = sc.nextLine();
		String [] x = s1.split("     ");
		for(String s2 : x)
		{
			StringBuffer sb = new StringBuffer(s2);
			System.out.print(sb.reverse().toString().replace("si", "is") + " ");
		}  
		
	}
}
