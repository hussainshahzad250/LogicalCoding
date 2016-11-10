package app4;
public class Y 
{
	public static void main(String[] args) 
	{
		String i = makeWord("[[]]", "hello");
		String j = makeWord("(())", "test");
		String k = makeWord("{{}}", "java");
		String l = makeWord("<<>>", "J2EE");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	static String makeWord(String out, String word)
	{
		return out.substring(0,2) + word + out.substring(2,4);
	}
}
