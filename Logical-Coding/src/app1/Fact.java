package app1;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("enter a number");
			number = sc.nextInt();
			int result = factorial(number);
			System.out.println("Factorial of " + number + " is  = " + result);
			System.out.println("find Factorial of another Number (y/n)");
		} while ("y".equals(sc.next()));
		System.out.println("End of Game");

	}

	private static int factorial(int number) {
		// 1.First Way to Find Factorila

				// if (number == 0) {
				// return 1;
				// }
				// return number * factorial(number - 1);

		// 2.Second Way to Find Factorial
		int res = 1;
		while (number != 0) {
			res = res * number;
			number--;
		}
		return res;

	}

}
