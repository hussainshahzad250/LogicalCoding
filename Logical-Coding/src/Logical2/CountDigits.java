package Logical2;
import java.util.Scanner;
public class CountDigits 
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();		
		int res = sum(num);
		System.out.println("Sum of digits of number  is:" + res);	    	
	}
	public static int sum(int num) 
	{		
		if(num == 0) 
		{			
			return num;
		}
		else 
		{			
			return (num % 10 + sum(num / 10));
		}
	}
}

