package LogicalSheet;
class A 
{
	public static void main(String[] args) 
	{
		boolean i = sleepIn(false, false);
		boolean j = sleepIn(true, false);
		boolean k = sleepIn(false, true);
		System.out.println(i); // true
		System.out.println(j); // false
		System.out.println(k); // true
	}
	static boolean sleepIn(boolean weekday, boolean vacation)
	{
		//solution1

		//return (! weekday || vacation);

		//solution2
		if (! weekday || vacation)
		{
			return true;
		}
		return false;
	}
}
