package app3;
public class G 
{
	public static void main(String[] args) 
	{
		String s1 = " abc 123 xyz123";
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("123",4));
		System.out.println(s1.indexOf(" ", 4));		
	}
}
