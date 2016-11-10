package app4;

import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		StringBuffer sb = new StringBuffer(s1);
		String s4 = sb.reverse().toString().replace("si", "is");
		System.out.println(s4);
		String [] s5 = s1.split(" ");
		int word =0;
		for(String s:s5)
		{
			word ++;
			/*System.out.println(s);*/
		}
		System.out.println("Total counter value = "+word + " ");
	
		
		
	}

}
