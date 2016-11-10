package app2;

import java.util.Scanner;

public class WordCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String s1 = sc.nextLine();
		String [] s2 = s1.split(" ");
		int count=0;
		for(String s : s2)
		{
			count ++;
			//System.out.println(s);
		}
		System.out.println("Total no of words = " + count);
	}

}
