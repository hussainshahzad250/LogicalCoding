package LogicalSheet;
class I
{
	public static void main(String args[])
	{
		String i = notString("candy");
		String j = notString("x");
		String k = notString("hello");
		String l = notString("not bad");
		String m = notString("not sure");
		System.out.println(i);//not candy
		System.out.println(j);//not x
		System.out.println(k);//not hello
		System.out.println(l);//not bad
		System.out.println(m);//not sure
	}	
		static String notString(String str)
		{
		    //solution1
			if(!str.startsWith("not"))
			{
				return "not "+str;
			}
			return str;
	  		// solution2
 			/* if(str.startsWith("not"))
			{
				return str;
			}
			else
			{
				return "not "+str;
			}
			*/
			//solution3
			/*
			//solution4
			/*
			String start = str.substring(0,3);
			String results = null;
			if(start.equals("not"))
			{
				results = str;
			}
			else
			{	
				results = "not "+str;
			}
				return results;
			*/
			//solution5
		   //return str.startsWith("not") ? str:"not "+str;
		}
}			











