/**
 * 
 */
package java8;

/**
 * @author shahzad.hussain
 *
 */
//Java code for Stream anyMatch 
//(Predicate predicate) to check whether 
//any element of this stream match 
//the provided predicate. 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnyMatch {

	// Driver code
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		boolean answer = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);
		System.out.println(answer);

		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
		answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));
		System.out.println(answer);

		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's' };
		String chString = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());
		System.out.println(chString);

		List<Character> charac = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');
		chString = charac.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(chString);

		List<String> str = Arrays.asList("Geeks", "for", "Geeks");
		chString = str.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(chString);

		charac = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');
		chString = charac.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(chString);

		str = Arrays.asList("Geeks", "for", "Geeks");
		chString = str.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(chString);

		charac = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');
		chString = charac.stream().map(String::valueOf).collect(Collectors.joining(", ", "{", "}"));
		System.out.println(chString);

		Stream<String> s = Stream.of("3", "4", "5");
		double ans = s.collect(Collectors.averagingInt(num -> Integer.parseInt(num)));
		System.out.println(ans);

		s = Stream.of("7", "8", "9", "10");
		ans = s.collect(Collectors.averagingInt(num -> Integer.parseInt(num)));
		System.out.println("Average [] " + ans);

		stream = Stream.of("Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");
		stream.filter(o -> o.endsWith("s")).forEach(System.out::println);

		String[] strr = { "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks" };
		List<String> strList = Arrays.asList(strr);
		List<String> collect = strList.stream().filter(o -> o.endsWith("s")).collect(Collectors.toList());
		System.out.println(collect);
		
		strList.stream().filter(o -> o.endsWith("s")).forEach(o->System.out.println(o));

	}
}
