package Logical;

public class CharFrequency
{
	public static void main(String[] args)
	{
		int letterCount = 0;
		String check_Word = "shahzadhussain";
		String s_letter="";
		int i ;
		for(i = 0; i<check_Word.length(); i++)
		{
			s_letter=check_Word.substring(i, i+1);
			if(s_letter.equals("a"))
			{
				letterCount ++;
			}
		}
		System.out.println("a is found " + letterCount + " times.");
	}
}
