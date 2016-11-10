package practice1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("enter a num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
		
	}
}
