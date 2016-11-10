package paractice;

public class ConvertOctalToDecimalNumber 
{
    public static void main(String[] args) 
    {
        String OctalNumber = "33";//declare string containing octal number
        int decimalNumber = Integer.parseInt(OctalNumber,8);
        System.out.print("Octal number " + OctalNumber+ " is = ");
        System.out.println("Decimal number " + decimalNumber);
            
    }
}
