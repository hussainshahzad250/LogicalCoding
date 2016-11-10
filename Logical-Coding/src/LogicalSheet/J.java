package LogicalSheet;
class J
{
	public static void main(String arg[])
	{
		String i = missingChar("Kitten",1);
		String j = missingChar("Kitten",0);
		String k = missingChar("Kitten",4);
		String l = missingChar("Kitten",2);
		System.out.println(i);//ktten
		System.out.println(j);//itten
		System.out.println(k);//kittn
		System.out.println(l);//kiten	
	}
		static String missingChar(String str,int n)
	{
		//solution1
		/* String s1 = str.substring(0,n);
			String s2 = str.substring(n+1,str.length());
			return s1+s2;
		*/
		//solution2
		/* StringBuffer sb = new StringBuffer(str);
			sb.deleteCharAt(n);
			return sb.toString();
		*/
		//solution3
			char[]  x = str.toCharArray();
			char[] y = new char[x.length -1];
			int j=0;
			for(int i=0; i<x.length ;i++)
		{
			if(i != n)
			{
				y [j++] = x [i];
			}
		}	
		String results = new String(y);
		return results;
	}
}