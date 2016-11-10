package LogicalSheet;
class E
{
	public static void main(String[] args) 
	{
		boolean i = parrotTrouble(true ,6);
		boolean j = parrotTrouble(true ,7);
		boolean k = parrotTrouble(false ,6);
		boolean m = parrotTrouble(true ,21);
		boolean n = parrotTrouble(false ,21);
		System.out.println(i); //true
		System.out.println(j); //false
		System.out.println(k); //false
		System.out.println(m); //true
		System.out.println(n); //false
	}
	static boolean parrotTrouble(boolean talking, int hour)
	{
		//solution1
		/*
		if ( talking && (hour < 7 || hour > 20))
		{
			return true;
		}
			return false;
			*/
		//solution2
		return ( talking && (hour < 7 || hour > 20));
	}
}
