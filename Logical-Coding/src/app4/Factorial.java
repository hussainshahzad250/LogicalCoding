package app4;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();		
		int res = fact(num);
		System.out.println("Factorial is:" + res);
	}
	
	public static int  fact(int num) {
		
		if(num == 0) {
			
			return 1;
			
		} else {
			
			return num * fact(num - 1);
		}
	}
}
