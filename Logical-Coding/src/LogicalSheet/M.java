package LogicalSheet;
class M
{
	public static void main(String[] args)
	{
		String i = backAround("cat");
		String j = backAround("hello");
		String k = backAround("test");
		String l = backAround("done");
		String m = backAround("a");
		System.out.println(i);//tcatt
		System.out.println(j);//ohelloo
		System.out.println(k);//ttestt
		System.out.println(l);//edonee
		System.out.println(m);//aaa
	}
	static String backAround(String str)
	{ 	
		char back = str.charAt(str.length() -1);
		return back + str + back;
	}
}