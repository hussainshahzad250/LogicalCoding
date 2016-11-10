package LogicalSheet;
class B 
{
	public static void main(String[] args) 
	{
		boolean i = monkeyTrouble(true, true);
		boolean j = monkeyTrouble(false, false);
		boolean k = monkeyTrouble(true, false);
		System.out.println(i); // true
		System.out.println(j); // true
		System.out.println(k); // false
	}
	static boolean monkeyTrouble(boolean asmile, boolean bsmile)
	{
		//solution1

		//return ((asmile && bsmile) || (! asmile && ! bsmile));

		//solution2
		
		if (asmile && bsmile)
		{
			return true;
		}
		if (! asmile && ! bsmile)
		{
			return true;
		}
		return false;
	}
}
