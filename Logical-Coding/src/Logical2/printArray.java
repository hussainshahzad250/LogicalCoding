package Logical2;
public class printArray 
{
	public static void main(String[] args) 
	{		
		FillArray obj = new FillArray(10);		
		for(int i = 1; i <= 10; i++) 
		{			
			obj.array[i - 1] = i;
		}		
		obj.printRecursively(obj.array.length);
	}	
}
class FillArray 
{	
	int [] array;	
	FillArray(int size) 
	{		
		array = new int[size];
	}	
	public void printRecursively(int value) 
	{
		if(value == 0) 
		{			
			return;
		} else 
		{			
			printRecursively(value - 1);
			System.out.println("Array[" + (value - 1) + "]: " + array[value - 1]);
		}
	}
}
