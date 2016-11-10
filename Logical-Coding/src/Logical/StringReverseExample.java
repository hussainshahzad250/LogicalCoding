package Logical;

public class StringReverseExample
{
	public static void main(String[] args)
	{
		/*String word = "HelloWorld";
		System.out.println("reverse =" + new StringBuffer(word).reverse().toString());
		StringBuffer sb = new StringBuffer(word);
		String s1 = sb.reverse().toString();
		System.out.println(s1);
		
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println("original string = " + word+ " reverse string= " +reverse);
		System.out.printf("original string %s, revere String %s %n", word, reverse);*/
		
		String word = "Band";
		String reverse = reverse(word);
		System.out.printf("original string %s, revere String %s %n ", word, reverse);
	}

	private static String reverse(String source)
	{
		if(source==null || source.isEmpty())
		{
			return source;
		}
		String reverse = "";
		for(int i = source.length()-1; i>=0; i--)
		{
			reverse = reverse + source.charAt(i);
		}
		return reverse;
	}

}
