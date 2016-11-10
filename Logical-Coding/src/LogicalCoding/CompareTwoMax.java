package LogicalCoding;
import java.util.Scanner;
public class CompareTwoMax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int i = sc.nextInt();
		System.out.println("inter second number");
		int j = sc.nextInt();
		if(i > j)
		System.out.println(i+" is greater than "+j);
		else
		System.out.println(j+" is greater than "+i);
	}
}