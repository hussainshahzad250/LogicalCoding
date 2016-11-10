package app4;
import java.util.Scanner;


public class sumNnumbs {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		
		int res = sum(num);
		System.out.println("Sum  is:" + res);
	}
	
	public static int sum(int num) {
		
		if(num == 1) {
			
			return 1;
		} else {
			
			return num + sum(num - 1);
			
		}
	}
}
