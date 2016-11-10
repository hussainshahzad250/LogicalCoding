package LogicalSheet;
class T
{
	public static void main(String[] args)
	{
		boolean i = loanTeen(13,99);
		boolean j = loanTeen(21,19);
		boolean k = loanTeen(13,13);
		boolean l = loanTeen(19,19);
		boolean m = loanTeen(20,24);
		boolean n = loanTeen(15,16);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//flase
		System.out.println(l);//false
		System.out.println(m);//false
		System.out.println(n);//false
	}
		static boolean loanTeen(int a,int b)
		{
			//solution1
		//return(((a>=13 && a<=19) && !(b>=13 && b<=19)) || (!(a>=13 && a<=19) && (b>=13 && b<=19)));
		//solution2
		if(((a>=13 && a<=19) && !(b>=13 && b<=19)) || (!(a>=13 && a<=19) && (b>=13 && b<=19)))
			{
			 return true;
			}
			return false;
		}
}
	
