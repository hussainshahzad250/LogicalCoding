/**
 * 
 */
package java8;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * @author shahzad.hussain
 *
 */
public class SummeryStatics {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(4, 5, 6, 7);
		IntSummaryStatistics summary_data = stream.summaryStatistics();
		System.out.println(summary_data);

		range();
	}

	private static void range() {
		IntStream stream = IntStream.range(5, 9);
		IntSummaryStatistics summary_data = stream.summaryStatistics();
		System.out.println(summary_data);
	}
}
