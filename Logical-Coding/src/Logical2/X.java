package Logical2;

public class X
{
	public static void main(String[] args)
	{
		boolean i = has271(new int [] {1, 2, 7, 1});
		boolean j = has271(new int [] {1, 2, 8, 1});
		boolean k = has271(new int [] {6, 6, 2, 6, 7, 2, 2});
		boolean l = has271(new int [] {6, 6, 6,4, 9, 2});
		boolean m = has271(new int [] {3, 8, 2,1, 1, 3});
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}
	static boolean has271(int[] nums)
	{
		for(int i = 0; i < (nums.length - 2); i++)
		{
			/*
			int val = nums[i];
			if(nums[i+1] == (val+5) && Math.abs(nums[i + 2] - (val - 1)) <=2)
			{
			return false ;
			}			
		}
		return true;
		*/
		if((nums[i + 1] == nums[i] + 5) && nums[i + 2] == nums[i] - 1)
			{
			return true;
			}
		}
		return false;
	}
}
	



	
