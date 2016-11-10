package paractice;

public class ConverBinaryToDecimalNumber
{	 
    public static void main(String[] args) 
    {
    	int i=10;/*
    	//declare string containing binary number
        String strBinaryNumber = "111000";
        int decimalNumber = Integer.parseInt(strBinaryNumber,2);
        System.out.println("Binary number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);*/
    	String s = Integer.toBinaryString(i);
    	System.out.println(s);
    }
}
