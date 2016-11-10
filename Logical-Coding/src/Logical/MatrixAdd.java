package Logical;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int r = sc.nextInt();
		System.out.println("Enter number of clolumn");
		int c = sc.nextInt();
		System.out.println("Enter Element of 1st Matrix");

		int a1[][] = new int[r][c], a2[][] = new int[r][c], a3[][] = new int[r][c];
		int i, j;
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Element of 2nd Matrix");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a2[i][j] = sc.nextInt();
			}
		}

		System.out.println("result");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a3[i][j] = a1[i][j] + a2[i][j];
			}
		}
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(a3[i][j] + " ");
			}
			System.out.println();
		}

	}

}