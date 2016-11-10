package LogicalCoding;

import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int result = 1;
		while(num>0)
		{
			result = result * num;
			num--;
		}
		System.out.println("Factorial of Given no. is : "+result);
	}
}