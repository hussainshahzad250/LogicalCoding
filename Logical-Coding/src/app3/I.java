package app3;

public class I 
{
	public static void main(String[] args) {
		String s1 = "lara";
		String s2 = "lara";
		String s3 = new String("lara");
		String s4 = new String("lara");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
	}

}
