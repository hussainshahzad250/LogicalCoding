package app4;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 16; i++) {
			
			int res = fibo(i);
			System.out.println(res);
		}
	}
	
	public static int  fibo(int num) {
		
		if(num == 0) {
			 return 0;
		}else if(num == 1) {
			
			return 1;
			
		} else {
			
			return fibo(num - 1) + fibo(num - 2);
		}
		
	}
	
}
