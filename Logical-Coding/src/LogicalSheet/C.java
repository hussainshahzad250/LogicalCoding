package LogicalSheet;
class C 
{
	public static void main(String[] args) 
	{
		int i = sumDouble(1,2);
		int j = sumDouble(3,2);
		int k = sumDouble(2,2);
		System.out.println(i); // 3
		System.out.println(j); // 5
		System.out.println(k); // 8
	}
	static int sumDouble(int a, int b)
	{
		//solution1
		/*
		int sum = a+b;
		if (a ==b)
		{
			sum = sum*2;
		}
		return sum;
		*/

		//solution2
			return a ==b ? 2*(a+b) : (a+b);
	}
}
