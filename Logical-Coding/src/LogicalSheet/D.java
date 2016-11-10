package LogicalSheet;
class D
{
	public static void main(String[] args)
	{
		int i = diff21(19);
		int j = diff21(10);
		int k = diff21(21);
		int m = diff21(31);
		System.out.println(i); //2
		System.out.println(j); //11
		System.out.println(k); //0
		System.out.println(m); //20
	}
	static int diff21(int n)
	{
		//solution1
		/* 
		 if (n<=21)
		{
		   return 21 - n;
		}
		   else
		{
		  return (n - 21) * 2;
		}
		*/
		
		//solution2
		//return n<=21 ? (21-n):2 * (n-21);
		
		//solution3
		if (n<=21)
		{
		return Math.abs(n-21);
		}
		else
		{
		return Math.abs(2*(n-21));
		}
	}
}