package Logical2;
class E
{
	public static void main(String[] args)
	{
		int i = arrayCount9(new int [] {1, 2, 9});
		int j = arrayCount9(new int [] {1, 9, 9});
		int k = arrayCount9(new int [] {1, 9, 9, 3, 9});
		int l = arrayCount9(new int [] {1, 2, 1, 9});
		System.out.println(i);//1
		System.out.println(j);//2
		System.out.println(k);//3
		System.out.println(l);//1
		}
		static int arrayCount9(int[] nums)
		{
			//solution1
			int count = 0;
			for(int i = 0; i<nums.length; i++)
			if(nums[i] == 9)
			{
				count ++;
			}
		return count;		
		}
}
	
