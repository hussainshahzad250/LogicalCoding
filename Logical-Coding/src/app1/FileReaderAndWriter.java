package app1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReaderAndWriter {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter a number"); int num =
		// sc.nextInt(); if (num % 2 == 0) {
		// System.out.println("even number"); } else {
		// System.out.println("odd number"); }
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("abc.txt");
			out = new FileOutputStream("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				try {
					out.write(c);
				} catch (Exception e) {
				}
			}
			System.out.println("File Reding Successfully");
		} catch (Exception e) {

		}
	}
}
