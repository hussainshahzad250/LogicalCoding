package Logical2;
class B
{
	public static void main(String[] args)
	{
		String i = frontTimes("Chocolate", 2);
		String j = frontTimes("Chocolate", 3);
		String k = frontTimes("Abc", 4);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		}
		static String frontTimes(String str, int n)
		{
			//solution1
			int frontLen  = 3;
			if(frontLen > str.length() )
			{
				frontLen = str.length();
			}
			String front = str.substring(0, frontLen);
			String result = "";
			for(int i = 0; i<n;  i++)
			{
				result = result + front;
			}
			return result;
		}
}
	
