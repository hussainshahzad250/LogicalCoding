package Logical2;
class C
{
	public static void main(String[] args)
	{
		int i = countXX("abcxx");
		int j = countXX("xxx");
		int k = countXX("xxxx");
		int l = countXX("xxxxx");
		System.out.println(i);//1
		System.out.println(j);//2
		System.out.println(k);//3
		System.out.println(l);//4
		}
		static int countXX(String str)
		{
			//solution1
			int count = 0;
			for(int i= 0; i< str.length() -  1; i++)
				if(str.substring(i, i + 2).equals("xx"))
			{
					count ++;
			}
			return count;
		}
}
	
