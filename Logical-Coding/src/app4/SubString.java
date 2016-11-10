package app4;

public class SubString 
{
	public static void main(String[] args) 
	{
		String i = makeword("hello", "bangalore");
		String j = makeword("test" , "hi");
		String k = makeword("java", "bye");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		String shahzad = makeMe("SuperPerfect");
		System.out.println(shahzad);
	}
	private static String makeMe(String string) {
		return "Shahzad is a "+string.substring(0, 5)+" "+ string.substring(5,12)+". ";
	}
	static String makeword(String a, String b)
	{
		//return a+b+b+a;
		return a.concat(b).concat(b).concat(a);
	}

}
