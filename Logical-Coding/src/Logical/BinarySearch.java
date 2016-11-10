package Logical;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int i, search, front, back, middle, arr[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the value of array");
		
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the value for search");		
		search = sc.nextInt();
		front = 0;
		back = arr.length - 1;
		middle = (front + back) / 2;
		while (front <= back) {
			if (arr[middle] < search) {
				front = middle + 1;
			} else if (arr[middle] == search) {
				System.out.println(search + " is found in location " + (middle + 1));
				break;
			} else {
				back = middle - 1;
			}
			middle = (front + back) / 2;
		}
		if (front > back) {
			System.out.println(search+" not found in array " );
		}

	}

}
