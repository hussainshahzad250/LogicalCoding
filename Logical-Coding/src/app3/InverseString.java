package app3;
public class InverseString 
{
	public static void main(String[] args) 
	{
		String string = "Hussain";
		System.out.println(reverseString(string));
		
	}

	private static String reverseString(String string) {
		String reverse ="";
		if(string ==null || string.isEmpty()){
			return string;
		}
		for(int i=string.length()-1;i>=0;i--){
			reverse = reverse+string.charAt(i);
		}
		
		return reverse;
				
	}

}
