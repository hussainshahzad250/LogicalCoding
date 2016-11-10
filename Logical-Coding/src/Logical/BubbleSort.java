package Logical;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort 
{
	static Scanner sc = new Scanner(System.in);
	static int counter = 0;
    static boolean check;
	public static void main(String[] args)
	{
		int[] unsorted = new int[10];
		System.out.println("enter your array");
		
		for(int i = 0; i < unsorted.length; i++) {
			
			unsorted[i] = sc.nextInt();
		}
		bubbleSort(unsorted);
	}
	private static void bubbleSort(int[] unsorted)
	{
		System.out.println("unsorted array before sorting = " + Arrays.toString(unsorted));	
		for(int i = 0; i < unsorted.length - 1; i++)
		{
			for(int j = 1; j < unsorted.length - i;j++)
			{
				check = true;
				counter++;
				if(unsorted[j-1] > unsorted[j])
				{
					check = false;
					int temp = unsorted[j];
					unsorted[j] = unsorted[j-1];
					unsorted[j-1] =temp;
				}
			}
			if(check) {
				break;
			}
		}
		System.out.println( Arrays.toString(unsorted));
		System.out.println("counter : " + counter);
	}
}
