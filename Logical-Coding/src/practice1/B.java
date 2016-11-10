package practice1;

public class B
{
	public static void main(String[] args)
	{
		int []x = {3,9,20,45,50,200,401,500,600,808,909};
		int i = binarySearch(x,45);
		
		int j=binarySearch(x, 25);
		System.out.println(i);
		System.out.println(j);
	}

	private static int binarySearch(int[] x, int element)
	{
		int index = -1;
		int begin = 0;
		int last=x.length-1;
		int middle;
		while (last>=begin)
		{
			middle=(begin+last)/2;
			if(x[middle]==element)
			{
				index=middle;
				break;
			}
			if(x[middle]>element)
			{
				last=middle-1;
			}
			else
			{
				begin=middle+1;
			}
		}
		if(index==-1)
		{
			if(element<x[0])
			{
				return index;
			}
			int j=-1;
			for(int i=0;i<x.length-1;i++)
			{
				j--;
				if(x[i]<element && x[i+1]>element)
				{
					break;
					
				}
			}
			if(element>x[x.length-1])
			{
				j--;
			}
			index=j;
		}
		return index;
	}
}
