/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shahzad.hussain
 *
 */
public class Manager2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(sum(list));
		System.out.println(sumbyJava8(list));
	}

	private static int sumbyJava8(List<Integer> list) {
		return list.stream().filter(o -> o > 5).mapToInt(o -> o).sum();
	}

	private static long sum(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int res = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 5) {
				res += num;
			}
		}
		return res;
	}
}
