 package paractice;
 	/*Convert hexadecimal number to decimal number example.
	This example shows how to convert hexadecimal number
	to decimal number using valueOf method of Integer
	wrapper class*/
 
public class ConvertHexToDecimalExample 
{
	public static void main(String[] args) 
	{               
		
		String HexNumber = "20";	   
		int decimalNumber = Integer.parseInt(HexNumber, 16);
		System.out.println("Hexadecimal number converted to decimal number");
		System.out.println("Decimal number is : " + decimalNumber);   
	}
}