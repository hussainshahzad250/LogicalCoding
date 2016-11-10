package LogicalSheet;
class S
{
	public static void main(String[] args)
	{
		boolean i = hasTeen(13,20,10);
		boolean j = hasTeen(20,19,10);
		boolean k = hasTeen(20,10,13);
		boolean l = hasTeen(24,21,8);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//true
		System.out.println(l);//false
	}
		static boolean hasTeen(int a,int b,int c)
		{
			//solution1
			//return(a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
			
			//solution2
			if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
			{
				return true;
			}
				return false;
		}
}