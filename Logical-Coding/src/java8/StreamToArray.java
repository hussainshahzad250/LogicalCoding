/**
 * 
 */
package java8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author shahzad.hussain
 *
 */
public class StreamToArray {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(5, 6, 7, 8, 9, 10);
		Object[] arr = stream.toArray();
		System.out.println(Arrays.toString(arr));

		Stream<String> strStream = Stream.of("Geeks", "for", "gfg", "GeeksQuiz");
		arr = strStream.filter(str -> str.startsWith("G")).toArray();
		System.out.println(Arrays.toString(arr));
	}
}
