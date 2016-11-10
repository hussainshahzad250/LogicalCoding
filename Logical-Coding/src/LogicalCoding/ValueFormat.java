package LogicalCoding;

/* Write a program that will read a float type value from the keyboard and print the
following output.
->Small Integer not less than the number.
->Given Number.
->Largest Integer not greater than the number.
*/
public class ValueFormat
{
	public static void main(String args[])
	{
		double i = 34.32; //given number
		System.out.println("Small Integer not greater than the number : "+Math.ceil(i));
		System.out.println("Given Number : "+i);
		System.out.println("Largest Integer not greater than the number : "+Math.floor(i));
	}
}