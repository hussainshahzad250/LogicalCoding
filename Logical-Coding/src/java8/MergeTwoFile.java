package java8;

/**
 * @author shahzad.hussain
 *
 */
/**
 * Java program to merge two files into third file alternatively 
 */

import java.io.*;

public class MergeTwoFile {
	public static void main(String[] args) throws IOException {
		// PrintWriter for output
		PrintWriter out = new PrintWriter("file3.txt");

		// BufferedReader object for file1.txt
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		while (line1 != null || line2 != null) {
			if (line1 != null) {
				out.println(line1);
				line1 = br1.readLine();
			}
			if (line1 == null && line2 != null) {
				out.println(line2);
				line2 = br2.readLine();
			}
		}
		out.flush();
		br1.close();
		br2.close();
		out.close();
		System.out.println("File Merged Successfully");
	}
}
