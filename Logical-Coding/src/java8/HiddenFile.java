/**
 * 
 */
package java8;

import java.io.File;

/**
 * @author shahzad.hussain
 *
 */
public class HiddenFile {

	public static void main(String[] args) {
		// Provide the complete file path here
		File file = new File("D:\\Study\\Video Tutorial\\App Deployment_.mp4");

		if (file.isHidden())
			System.out.println("The specified file is hidden");
		else
			System.out.println("The specified file is not hidden");

		deleteFile();
	}

	private static void deleteFile() {
		File file = new File("D:\\Study\\acb.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			file.mkdir();
			System.out.println("file was not available its created");
		}
	}
}
