package Logical2;
class D
{
	public static void main(String[] args)
	{
		boolean i = doubleX("axxb");
		boolean j = doubleX("axaxax");
		boolean k = doubleX("xxxxx");
		boolean l = doubleX("xxxaxx");
		System.out.println(i);//T
		System.out.println(j);//F
		System.out.println(k);//T
		System.out.println(l);//T
		}
		static boolean doubleX(String str)
		{
			//solution1
			int i = str.indexOf("x");
			if(i == -1) return false;
			if(i +1>= str.length()) return false;
			return str.substring(i + 1, i + 2).equals("x");
		}
}
	
