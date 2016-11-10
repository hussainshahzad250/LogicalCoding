package Logical;

import java.util.Scanner;

public class MultiplicationOfMatrix
{
	public static void main(String[] args)
	{
		int m, n, p, q, k, c, d, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. rows and column of 1st matrix");
		m=sc.nextInt();
		n=sc.nextInt();
		int firstarr[][] =new int [m][n];
		System.out.println("Enter the element for 1st matrix");
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				firstarr[c][d]=sc.nextInt();
		
		System.out.println("Enter the no. rows and column of 2nd matrix");
		p=sc.nextInt();
		q=sc.nextInt();
		if(n!=p)
		{
			System.out.println("Mateix can't be maultiplied");
		}
		else
		{
			int secondarr[][]=new int[p][q];
			int multiply[][]=new int [m][q];
			System.out.println("enter the element for 2nd matrix");
			for(c=0;c<p;c++)
				for(d=0;d<q;d++)
					secondarr[c][d]=sc.nextInt();
			
			for(c=0;c<m;c++)
			{
				for(d=0;d<q;d++)
				{
					for(k=0;k<p;k++)
					{
						sum=sum+firstarr[c][k]*secondarr[k][d];
					}
					multiply[c][d]=sum;
					sum=0;
				}
			}
			System.out.println("Product of entered matrix are");
			for(c=0;c<m;c++)
			{
				for(d=0;d<q;d++)
					System.out.print(multiply[c][d]+" ");
				System.out.println();
			}
		}
	}

}
