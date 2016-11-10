package Logical;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		System.out.println("pls Enter a Number = ");
		int palindrome = new Scanner(System.in).nextInt();
		if(isPalindrome(palindrome))
		{
			System.out.println("Number " + palindrome + " is a palindrome");
		}
		else
		{
			System.out.println("Number " + palindrome + " is  not a palindrome");
		}
	}
	private static boolean isPalindrome(int number) 
	{
		int palindrome = number;
		int  reverse=0;
		while(palindrome != 0 )
		{
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome/10;
		}
		if(number == reverse)
		{
			return true;
		}
		return false;
	}
}
