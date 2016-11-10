package paractice;
public class Prime 
{
	public static void main(String[] args) 
	{
		int limit = 100;
		int counter =0;
		System.out.println("Prime numbers between 1 and " + limit);
		for(int i=1; i < 100; i++)
		{
			boolean isPrime = true;
			for(int j=2; j< i ; j++)
			{
				counter ++;
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("steps = "+ counter);	
	}
	
}
