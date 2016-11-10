package LogicalSheet;
class Q
{
	public static void main(String[] args)
	{
		boolean i = icyHot(120,-1);
		boolean j = icyHot(-1,120);
		boolean k = icyHot(2,120);
		boolean l = icyHot(-122,-100);
		System.out.println(i);//true
		System.out.println(j);//true
		System.out.println(k);//false
		System.out.println(l);//false
	}
	static boolean icyHot(int temp1,int temp2)
	{
	/*
	if((temp1<0 && temp2>100) || (temp1>100 && temp2<0))
	{
	return true;
	}
	return false;
	*/
	//solution2
	return (temp1<0 && temp2>100) || (temp1>100 && temp2<0);
	}
}