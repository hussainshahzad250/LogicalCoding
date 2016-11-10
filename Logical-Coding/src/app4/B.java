package app4;
public class B 
{
	public static void main(String[] args) 
	{
		boolean i = makeword("hello");
		boolean j = makeword("test");
		boolean k = makeword("java");
		boolean l = makeword("j2ee");
		boolean m = makeword("hi to all");
		System.out.println(i);
		System.out.println(j); 
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}
	static boolean makeword(String str)
	{
		char[] x = str.toCharArray();
		int count = 0;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == 'e')
			{
				count ++ ;
			}
		}
		return (count>=1 && count <=3);
	}
}
