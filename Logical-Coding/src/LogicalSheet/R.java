package LogicalSheet;
class R
{
	public static void main(String[] args)
	{
		boolean i = int1020(12,99);
		boolean j = int1020(21,12);
		boolean k = int1020(8,99);
		boolean l = int1020(20,4);
		boolean m = int1020(22,24);
		boolean n = int1020(120,40);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//false
		System.out.println(l);//true
		System.out.println(m);//false
		System.out.println(n);//false
	}
	static boolean int1020(int a,int b)
	{
		//solution1
		//return(a>=10 && a<=20) || (b>=10 && b<=20);

		//solution2
		if((a>=10 && a<=20) || (b>=10 && b<=20))
		{
			return true;
		}
			return false;
	}
}