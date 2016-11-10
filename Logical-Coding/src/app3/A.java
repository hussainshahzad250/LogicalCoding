package app3;

public class A
{
	public static void main(String[] args)
	{
		String s1 = " abc 123 xyz123";
		System.out.println(s1.indexOf("Xyz"));
		System.out.println(s1.indexOf("123",4));
		System.out.println(s1.lastIndexOf(" ",4));
	}
}
