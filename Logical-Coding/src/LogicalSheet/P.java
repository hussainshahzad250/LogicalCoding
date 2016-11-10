package LogicalSheet;
class P
{
	public static void main(String[] args)
	{
		boolean i = startHi("hi there");
		boolean j = startHi("Hi");
		boolean k = startHi("hello hi");
		boolean l = startHi("Hiii");
		boolean m = startHi("h");
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//false
		System.out.println(l);//true
		System.out.println(m);//false
	}
	static boolean startHi(String str)
	{
	//solution1
	/*
	if(str.startsWith("hi") || (str.startsWith("Hi")))
	{
	return true;
	}
	return false;
	*/
	
	//solution2
	return(str.startsWith("hi") || (str.startsWith("Hi")));
									//solution3
									/*
									if(str.length() >= 2)
									{
										String Firsttwo = str.substring(0,2);
										return Firsttwo.equal("hi");
									}
									 return false;
									*/
	}
}