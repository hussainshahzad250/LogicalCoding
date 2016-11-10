package app2;

import java.util.Scanner;

/*
  Reverse Number using Java
  This Java Reverse Number Example shows how to reverse a given number.
*/

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int number = sc.nextInt();
		int reversedNumber = 0;
		int temp = 0;

		while (number > 0) {

			temp = number % 10;
			reversedNumber = reversedNumber * 10 + temp;//23
			number = number / 10;

		}

		System.out.println("Reversed Number is: " + reversedNumber);
	}
}

/*
 * Output of this Number Reverse program would be Reversed Number is: 4321
 */