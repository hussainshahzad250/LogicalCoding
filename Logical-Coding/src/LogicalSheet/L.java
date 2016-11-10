package LogicalSheet;
class L
{
	public static void main(String[] args)
	{
		String i = front3("a");
		String j = front3("ab");
		String k = front3("abc");
		String l = front3("abcd");
		String m = front3("hello");
		String n = front3("java");
		String o = front3("how are you?");
		System.out.println(i);//aaa
		System.out.println(j);//ababab
		System.out.println(k);//abcabcabc
		System.out.println(l);//abcabcabc
		System.out.println(m);//helhelhel
		System.out.println(n);//javjavjav
		System.out.println(o);//howhowhow
	}
	static String front3(String str)
	{
	//solution1
	/*
	String front = null;
	if(str.length() >=3)
	{
	front = str.substring(0,3);
	}
	else
	{
	front = str;
	}
	return front + front + front;
	*/

	//solution2
	return str.length() >=3 ? (str.substring(0,3) + str.substring(0,3) + str.substring(0,3)):(str+str+str);
	}
}
	