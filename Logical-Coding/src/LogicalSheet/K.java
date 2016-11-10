package LogicalSheet;
class K
{
	public static void main(String[] args)
	{
		String i = frontBack("code");
		String j = frontBack("a");
		String k = frontBack("ab");
		String l = frontBack("java");
		String m = frontBack("hello");
		System.out.println(i);//eodc
		System.out.println(j);//a
		System.out.println(k);//ab
		System.out.println(l);//aavj
		System.out.println(m);//oehll
	}
	static String frontBack(String str)
	{
		//solution1
		if(str.length() == 1)
		{
			return str;
		}
		char s1 = str.charAt(0);
		String s2 = str.substring(1, str.length() - 1);
		char s3 = str.charAt(str.length() - 1);
		return s1 + s2 + s3;
		//solution2
		/*
		if(str.length() ==1)
		{
			return str;
		}
		char[] x = str.toCharArray();
		char temp = x[0];
		x[0] = x[x.length - 1];
		x[x.length -1] = temp;
		String results = new String(x);
		return results;
		*/
	}
}