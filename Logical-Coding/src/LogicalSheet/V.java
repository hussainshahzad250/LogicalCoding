package LogicalSheet;
class V
{
	public static void main(String[] args)
	{
		boolean i = mixStart("mix snacks");
		boolean j = mixStart("pix snacks");
		boolean k = mixStart("piz snacks");
		System.out.println(i);// true
		System.out.println(j);// true
		System.out.println(k);// false
		}
		static boolean mixStart(String str)
		{
			//solution1
			//return (str.length() >=3 && str.substring(1,3).equals("ix"));
			//solution2
			if(str.length() < 3) return false;
			String two = str.substring(1,3);
			if(two.equals("ix"))
			{
				return true;
			}
				return false;
		}
}
	
