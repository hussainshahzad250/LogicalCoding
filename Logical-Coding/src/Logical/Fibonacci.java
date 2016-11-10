package Logical;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int  i = sc.nextInt();
		int fibo1 = 0, fibo2 = 1, fibo3 ;
		System.out.println(fibo1);
		System.out.println(fibo2);
		for( int j = 1; j<=i-2; j++)
		{
			fibo3 = fibo1+fibo2;
			System.out.println(fibo3);
			fibo1 = fibo2;
			fibo2= fibo3;
		}
	}
}
