package app1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader br = null;
		String line;
		int count = 0;
		br = new BufferedReader(new FileReader("abc.txt"));

		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.contains("Shahzad")) {
					System.out.println(line);
					count++;
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
