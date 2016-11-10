package app2;
/*
        Calculate Rectangle Perimeter using Java Example
        This Calculate Rectangle Perimeter using Java Example shows how to calculate
        perimeter of Rectangle using it's length and width.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CalculateRectPerimeter {
 
        public static void main(String[] args) {
               
                int width = 0;
                int length = 0;
                       
                try
                {
                        //read the length from console
                        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Please enter length of a rectangle");
                        length = Integer.parseInt(bin.readLine());
 
                        //read the width from console
                        System.out.println("Please enter width of a rectangle");
                        width = Integer.parseInt(bin.readLine());
                }
                //if invalid value was entered
                catch(NumberFormatException ne)
                {
                        System.out.println("Invalid value" + ne);
                        System.exit(0);
                }
                catch(IOException ioe)
                {
                        System.out.println("IO Error :" + ioe);
                        System.exit(0);
                }
                int perimeter = 2 * (length + width);      
                System.out.println("Perimeter of a rectangle is " + perimeter);
        }               
}
