package Logical2;
class A
{
	public static void main(String[] args)
	{
		String i = stringTimes("Hi", 2);
		String j = stringTimes("Hi", 3);
		String k = stringTimes("Hi", 5);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

	private static String stringTimes(String string, int n) {
		
		String result ="";
		for(int i=0;i<n;i++){
			result = result+string;
		}
		return result;
	}
	
}
	
