package matrix;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		int i, j, r, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of row");
		r = sc.nextInt();

		System.out.println("enter number of column");
		c = sc.nextInt();

		System.out.println("Enetr Element of Matrix");
		int a1[][] = new int[r][c], a2[][] = new int[r][c], a3[][] = new int[r][c];

		for (i = 0; i < r; i++)
			for (j = 0; j < c; j++)
				a1[i][j] = sc.nextInt();

		System.out.println("secong array element2");
		for (i = 0; i < r; i++)
			for (j = 0; j < c; j++)
				a2[i][j] = sc.nextInt();

		System.out.println("Result");

		for (i = 0; i < r; i++)
			for (j = 0; j < c; j++)
				a3[i][j] = a1[i][j] + a2[i][j];

		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(a3[i][j] + " ");

			}
			System.out.println();
		}
	}

}
