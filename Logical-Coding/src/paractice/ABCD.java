package paractice;

public class ABCD {
	public static void main(String[] args) {
		String[] x = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		for (int i = 0; i < 26; i++) {
			if (i % 2 == 0)
				System.out.print(x[i].toUpperCase() + " ");
			else
				System.out.print(x[i] + " ");
		}
		System.out.println();
		char ch;
		for (ch = 'A'; ch <= 'M'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for (ch = 'n'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}
