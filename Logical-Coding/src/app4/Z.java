package app4;
public class Z 
{
	public static void main(String[] args) 
	{
		String i = extraEnd("Banglore");
		String j = extraEnd("hello");
		String k = extraEnd("java");
		String l = extraEnd("test");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	static String  extraEnd(String str)
	{
		String last = str.substring(str.length()-2, str.length());
		
		//return last+last+last;
		return last.concat(last).concat(last);
	}
}
