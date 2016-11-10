package app3;
import java.util.Scanner;
public class Shahzad
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter any String");
			String s1 = sc.next();
			System.out.println("Enter another String");
			String s2 = sc.next();
			System.out.println("do u want one more(y/n)");
		}
		while("y".equals(sc.next()));
		{
			System.out.println("game end");
		}
	}
}
