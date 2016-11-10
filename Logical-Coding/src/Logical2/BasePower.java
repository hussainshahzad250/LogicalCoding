package Logical2;
import java.util.Scanner;
public class BasePower 
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a Base...");
		int base = sc.nextInt();		
		System.out.println("Enter a power....");
		int pow = sc.nextInt();		
		int res = power(base, pow);
		System.out.println("Result is: " + res);
	}	
	public static int power(int x, int N) 
	{
		int temp = 1;
		if(N == 0) 
		{			  
			return 1;
		}
		temp  = power(x, N / 2);
		if((N % 2) == 0) 
		{
			return (temp * temp);
		}
		else 
		{			 
			return (x * temp * temp);
		}	  
 	}
}
