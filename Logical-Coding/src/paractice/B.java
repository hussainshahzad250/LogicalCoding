package paractice;
public class B
{
	public static void main(String[] args)
	{
		String s1="STRING is immutable";
//		char ch[] = s1.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.print(ch[i] +" ");
//		}
//		System.out.println();
//		System.out.print("=========");
		s1 = new StringBuffer(s1).reverse().toString();
		
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(ch1[i] +" ");
		} 
	}
}
