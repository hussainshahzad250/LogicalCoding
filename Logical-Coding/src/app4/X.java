package app4;
public class X 
{
	public static void main(String[] args) 
	{
		String i = makeTag("i", "hello");
		String j = makeTag("b", "hello");
		String k = makeTag("u", "hello");
		String l = makeTag("center", "hello");
		System.out.println(i); 
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	static String makeTag(String a, String b)
	{
		return "<" + a + ">" + b + "</" + a + ">";
	}

}
