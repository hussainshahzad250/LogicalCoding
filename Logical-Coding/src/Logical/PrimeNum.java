package Logical;
import java.util.Scanner;
public class PrimeNum
{
	public static void main(String[] args)
	{
		int i, status = 1, num =3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of prime number which ever you want" );
		i = sc.nextInt();
		if(i>=1)
		{
			System.out.println("first " + i + " prime numbers are  "  );
			System.out.println(2);
		}
		for(int count = 2; count <=i;)
		{
			for(int j = 2; j<=Math.sqrt(num); j++)
			{
				if(num%j==0)
				{
					status = 0;
					break;
				}
			}
			if(status !=0)
			{
				System.out.println(num);
				count ++;
			}
			status =1;
			num ++;
		}
	}
}
