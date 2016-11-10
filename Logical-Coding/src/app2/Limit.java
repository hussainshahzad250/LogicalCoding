package app2;

import java.util.StringTokenizer;

public class Limit {
	public static void main(String[] args) {
		int limit = 25;
		int a = 0, b = 0, c = 0;
//		int s1 = FirstThree(0, 0, 1);
//		System.out.println(s1);
		String s1 = "Shahzad hussain is a good boy";
		StringTokenizer st  =new StringTokenizer(s1," ");
		while (st.hasMoreElements()) {
			Object object = (Object) st.nextElement();
			System.out.println(object);
		}
	}

	private static int FirstThree(int a, int b, int c) {
		for (int i = 0; i < 25; i++) {

			if (a == 0 || b == 0 || c == 1) {
				return a + b + c;
			}
		}
		return a + b + c;

	}

}
