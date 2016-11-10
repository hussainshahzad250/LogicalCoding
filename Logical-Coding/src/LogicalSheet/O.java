package LogicalSheet;
class O
{
	public static void main(String[] args)
	{
		String i = front22("kitten");
		String j = front22("Ha");
		String k = front22("abc");
		String l = front22("a");
		String m = front22("test");
		String n = front22("hello");
		System.out.println(i);//kikittenki
		System.out.println(j);//HaHaHa
		System.out.println(k);//ababcab
		System.out.println(l);//aaa
		System.out.println(m);//tetestte
		System.out.println(n);//hehellohe
	}
	static String front22(String str)
	{
	//solution1
	/*
	String front = null;
	if(str.length() <=2)
	{
	front = str;
	}
	else
	{
	front = str.substring(0,2);
	}
	return front + str + front;
	*/
	//solution2
	return(str.length() <= 2) ? (str + str + str):(str.substring(0,2)) + (str) + (str.substring(0,2));
	}
}