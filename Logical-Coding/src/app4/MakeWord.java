package app4;

public class MakeWord 
{
	public static void main(String[] args) 
	{
		String i = makeword("hello");
		String j = makeword("test");
		String k = makeword("java");
		String l = makeword("shahzad");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	static String makeword(String str)
	{
		return "Hello " + str + "!" ; 
	}

}
