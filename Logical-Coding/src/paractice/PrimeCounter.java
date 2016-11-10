package paractice;
public class PrimeCounter
{
	public static void main(String[] args) 
	{
		int limit = 1000;
		int counter = 0;

		System.out.println("Prime numbers between 1 and " + limit);
		for(int i=1; i < 1000; i++)
		{
			boolean isPrime = true;
			for(int j=2; j < i ; j++)
			{
				counter++;
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
		System.out.println("\ncounter = " + counter);
	}
}
