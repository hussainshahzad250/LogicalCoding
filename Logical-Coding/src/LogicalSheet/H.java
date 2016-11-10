package LogicalSheet;
class H
{
	public static void main(String[] args)
	{
		boolean i = PosNeg(1,-1,false);
		boolean j = PosNeg(-1,1,false);
		boolean k = PosNeg(-4,-5,true);
		boolean l = PosNeg(-4,-5,false);
		boolean m = PosNeg(4,-5,false);
		boolean n = PosNeg(4,5,true);
		boolean o = PosNeg(4,5,false);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//true
		System.out.println(l);//false
		System.out.println(m);//true
		System.out.println(n);//false
		System.out.println(o);//false
	}
		static boolean PosNeg(int a,int b,boolean negative)
		{
			//solution1
			
			if(((negative && (a<0 && b<0)) || (!negative && (a<0 && b>0) || (a>0 && b<0))) )
			{
			  return true;
			}
			  return false;

			//solution2
			//return((negative && (a<0 && b<0)) || (!negative && (a<0 && b>0) || (a>0 && b<0)));
		}
}