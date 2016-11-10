package Logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CheckDuplicate
{
	public static void main(String[] args)
	{
		String[] withDuplicate = new String[]{"one","two","three", "one"};
		String[] withoutDuplicate = new String[]{"one","two","three"};
		//System.out.println("checking array with duplicate using bruteforce " + bruteforce(withDuplicate));
		//System.out.println("checking array without duplicate using bruteforce " + bruteforce(withoutDuplicate));
		System.out.println("checking array with duplicate using Set and List " + CheckDuplicateUsingSet(withDuplicate));	
		System.out.println("checking array without any duplicate using Set and List " + CheckDuplicateUsingSet(withoutDuplicate));
		//System.out.println("checking array with duplicate using Set and List " + CheckDuplicateUsingAdd(withDuplicate));
		//System.out.println("checking array without any duplicate using Set and List " + CheckDuplicateUsingAdd(withoutDuplicate));
	}
	private static boolean CheckDuplicateUsingSet(String[] input)
	{
		List l1 = Arrays.asList(input);
		Set s1 = new HashSet(l1);
		if(s1.size()<l1.size())
		{
			return true;
		}
		return false;
	}

/*	private static boolean CheckDuplicateUsingAdd(String[] input)
	{
		Set tempSet = new HashSet();
		for(String str : input)
		{
			if(!tempSet.add(str))		
			{
				return true;
			}
		}	
		return false;
	}
*/	
	
	/*private static boolean bruteforce(String[] input)
	{
		for(int i = 0;i< input.length;i++)
		{
			for(int j = 0;j<input.length; j++)
			{
				if(input[i].equals(input[j]) && i != j)
				{
					return true;
				}
			}
		}
		return false;
	}	*/
}
