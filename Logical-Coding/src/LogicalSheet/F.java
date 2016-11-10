package LogicalSheet;
class F
{
	public static void main(String[] args) 
	{
		boolean i = makes10(9 ,10);
		boolean j = makes10(9 ,9);
		boolean k = makes10(1 ,9);
		boolean m = makes10(4 ,6);
		boolean n = makes10(6 ,6);
		System.out.println(i); //true
		System.out.println(j); //false
		System.out.println(k); //true
		System.out.println(m); //true
		System.out.println(n); //false
	}
	static boolean makes10(int a, int b)
	{
		//solution1
		/*
		if (( a == 10 || b == 10) || ((a + b) == 10))
		{
			return true;
		}
			return false;
			*/
		//solution2
		return (( a == 10 || b == 10) || ((a + b) == 10));
	}
}
