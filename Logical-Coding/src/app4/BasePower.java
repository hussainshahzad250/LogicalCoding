package app4;
import java.util.Scanner;


public class BasePower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Base...");
		int base = sc.nextInt();
		
		System.out.println("Enter a power....");
		int pow = sc.nextInt();
		
		int res = power(base, pow);
		
		System.out.println("Result is: " + res);
	}
	
	public static int power(int x, int N) {
		
 		  int temp = 1;
		  
		  if(N == 0) {
			  
			  return 1;
		  }
 		  temp  = power(x, N / 2);
 		  if((N % 2) == 0) {
 			  System.out.println("hi");
			  System.out.println(temp);
			  return (temp * temp);
		  } else {
			  System.out.println("bye");
			  System.out.println(temp);
			  return (x * temp * temp);
		  }
		  
 	}
}


/*if(pow == 0) {
	
	return 1;
} else {
	
	return base* power(base,  pow - 1);
}*/