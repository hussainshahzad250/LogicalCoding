/**
 * 
 */
package java8;

/**
 * @author shahzad.hussain
 *
 */
//Java program to demonstrate read and write of image 
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageProcessing {
	public static void main(String args[]) throws IOException {
		int width = 200;
		int height = 200;
		BufferedImage image = null;
		// READ IMAGE
		try {
			File input_file = new File("C:\\Users\\Shahzad.Hussain\\Downloads\\actress\\2.jpg");
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(input_file);
			System.out.println("Reading complete.");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}

		// WRITE IMAGE
		try {
			File output_file = new File("C:\\Users\\Shahzad.Hussain\\Downloads\\actress\\Out.jpg");
			ImageIO.write(image, "jpg", output_file);
			System.out.println("Writing complete.");
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
