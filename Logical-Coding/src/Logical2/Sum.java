package Logical2;
import java.util.Scanner;
public class Sum 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		System.out.println("sum 0f " +num1 + " and "+ num2+ " is = " +(num1+num2));
	}
}
