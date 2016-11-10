package LogicalSheet;
class N
{
	public static void main(String[] args)
	{
		boolean i = or35(3);
		boolean j = or35(30);
		boolean k = or35(10);
		boolean l = or35(8);
		boolean m = or35(21);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//true
		System.out.println(l);//false
		System.out.println(m);//true
	}
	static boolean or35(int n)
	{
	
	//solution1
	/*
	if(n % 3 == 0 || n % 5 == 0)
	{
	return true;
	}
	return false;
	*/
	
	//solution2
	//return(n % 3 == 0 || n % 5 == 0) ? true:false;
	
	//solution3
	return (n % 3 == 0 || n % 5 == 0);
	}
}