/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shahzad.hussain
 *
 */
public class Manager1 {

	public static void main(String[] args) {

		listToString();

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		removeDuplicatesFromArrayList(list);

		System.out.println(list.stream().mapToInt(o -> o).summaryStatistics().getMax());

		findMaxAndMin();
	}

	private static void findMaxAndMin() {

		// create an ArrayList Object list
		List<Integer> list = new ArrayList<>();

		// add element in ArrayList object list
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);

		// print min amd max value of ArrayList
		System.out.println("Min\t: \t" + findMin(list));
		System.out.println("Max\t: \t" + findMax(list));
		System.out.println("Sum\t: \t" + findSum(list));
		System.out.println("Count\t: \t" + count(list));

	}

	private static long count(List<Integer> list) {

//		return list.stream().mapToInt(o -> o).summaryStatistics().getCount();
		return list.stream().mapToInt(o -> o).count();
	}

	private static long findSum(List<Integer> list) {
//		return list.stream().mapToInt(o -> o).summaryStatistics().getSum();
		return list.stream().mapToInt(o -> o).sum();
	}

	private static int findMax(List<Integer> list) {
//		return list.stream().mapToInt(o -> o).summaryStatistics().getMax();
		return list.stream().mapToInt(o -> o).max().getAsInt();
	}

	private static int findMin(List<Integer> list) {
//		return list.stream().mapToInt(o -> o).summaryStatistics().getMin();
		return list.stream().mapToInt(o -> o).min().getAsInt();
	}

	private static void removeDuplicatesFromArrayList(ArrayList<Integer> list) {
		System.out.println("ArrayList with duplicates: " + list);
		// First way
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		System.out.println("ArrayList with duplicates removed: " + newList);

		// second way
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
	}

	/**
	 * Convert a List of String to a comma separated String in Java
	 */
	private static void listToString() {
		List<String> list = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
		System.out.println("ArrayList " + list);
		String s = String.join(", ", list);
		System.out.println("String with comma separated " + s);
	}
}
