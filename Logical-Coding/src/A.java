
public class A {
	public static void main(String[] args) throws InterruptedException {
//		String s2 = "abc";
//		String s3 = "abc";
//		System.out.println(s2.equals(s3));
//		System.out.println("**********");
		
		String s1 = "this is my pen";
		String[] a = s1.split(" ");

//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

		for (int i = a.length - 1; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.print(a[i] + " ");
		}

//		System.out.println();
//		for (char a1 = 'A'; a1 <= 'Z'; a1++) {
//			Thread.sleep(1000);
//			System.out.print(a1 + " ");
//		}
//		System.out.println();
//		for (char a1 = 'a'; a1 <= 'z'; a1++) {
//			Thread.sleep(1000);
//			System.out.print(a + " ");
//		}

	}

}
