package app1;

import java.util.Scanner;

public class Fibinacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int number = sc.nextInt();
		int febo1 = 0,febo2=1,febo3;
		System.out.println(febo1);
		System.out.println(febo2);
		for(int j=1;j<number-1;j++)
		{
			febo3=febo1+febo2;
			System.out.println(febo3);
			febo1=febo2;
			febo2=febo3;
			
		}
	}

}
