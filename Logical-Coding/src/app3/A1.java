package app3;

public class  A1
{
	public static void main(String[] args) 
	{
		String a = "abcxyz";
		String b = "abc";
		final String c = "abc";
		String d = b + "xyz";
		String e = c + "xyz";
		System.out.println(a == d);
		System.out.println(a == e);
	}
}
