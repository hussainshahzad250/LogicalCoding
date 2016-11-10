package Logical;

import java.util.Scanner;

public class MatrixMultification
{
	public static void main(String[] args)
	{
		int n,m,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of row and column of matrix");
		m= sc.nextInt();
		n= sc.nextInt();
		int arr1[][]= new int [m][n], arr2[][]= new int [m][n], sum [][]= new int [m][n];
		System.out.println("enter the value for 1st array");
		for(c = 0; c< m;c++)
		for(d = 0;d<n; d++)
			arr1[c][d] = sc.nextInt();
		System.out.println("enter the value for 2nd array");
		for(c = 0; c< m;c++)
		for(d = 0;d<n; d++)
		arr2[c][d] = sc.nextInt();
		
		if(m==n){
			for(c = 0; c< m;c++)
				for(d = 0;d<n; d++)
				sum[c][d] =arr1[c][d] * arr2[c][d];
				System.out.println("result");
				for(c = 0; c< m;c++)
				{
					for(d = 0;d<n; d++)
					{
						System.out.print(sum[c][d]+" ");
					}
					System.out.println();
				}
		}
		else{
			System.out.println("Matrix can not be added");
		}
	}

	
}
