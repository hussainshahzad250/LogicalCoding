package paractice;


public class ListEvenNumber 
{
    public static void main(String[] args) 
    {
    	int limit = 10;
    	int counter=0;
        System.out.println("Printing Even numbers between 1 and " + limit);
        for(int i=1; i <= limit; i++)
        {
        	if( i % 2 == 0)
        	{
        		counter ++;
            System.out.print(i + " ");
        	}
        }
        System.out.println("\nTotal Even Number= " + counter);
    }
}