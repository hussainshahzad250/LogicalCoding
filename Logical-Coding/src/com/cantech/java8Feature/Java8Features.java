package com.cantech.java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * 
 * @author Shahzad Hussain
 *
 */
public class Java8Features {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(51);
		list.add(17);
		list.add(9);
		list.add(19);
		list.sort(Comparator.naturalOrder());
		System.out.println("ASC List" + list);
		list.sort(Comparator.reverseOrder());
		System.out.println("DESC LIST" + list);
		System.out.println(list.stream().mapToInt(o -> o).summaryStatistics().getMax());
		System.out.println(list.stream().mapToInt(o -> o).sum());
		OptionalDouble average = list.stream().mapToInt(o -> o).average();
		System.out.println("Average :: " + average.getAsDouble());

		System.out.println("================");
		List<String> strings = new ArrayList<>();
		strings.add("ash");
		strings.add("hussain");
		strings.add("shahzad");
		strings.add("ejaz");
		strings.add("shahid");
		strings.add(null);
//		strings.sort(String.CASE_INSENSITIVE_ORDER);
		strings.forEach(o->{
			if(o!=null){
				System.out.println(o);
			}
		});
		System.out.println(strings);
		List<String> collect2 = strings.stream().filter(o->o!=null).collect(Collectors.toList());
		System.out.println("collect2"+collect2);
		
//		strings.sort(Comparator.naturalOrder());
//		System.out.println(strings);
//		strings.sort(Comparator.reverseOrder());
//		System.out.println(strings);
		
		System.out.println("================");
		list.forEach(System.out::println);
		List<Person> person = new ArrayList<>();
		person.add(new Person("id1", "name1", 25, 40000));
		person.add(new Person("id2", "name2", 84, 45000));
		person.add(new Person("id3", "name3", 35, 48000));
		person.add(new Person("id4", "name4", 86, 32000));
		// person.add(new Person("id5", "name5", 73,150000));

		System.out.println(person.stream().mapToInt(o -> o.getAge()).summaryStatistics().getMax());
		double max = person.stream().mapToDouble(o -> o.getSalary()).summaryStatistics().getMax();
		System.out.println("Maximum Salary " + max);
		person.stream().forEach(o -> {
			System.out.println("Salary is " + o.getSalary());
		});
		List<Person> collect = person.stream().filter(o -> o.getAge() > 35 && o.getSalary() >= 40000)
				.collect(Collectors.toList());
		System.out.println(collect);

		System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7).stream().map(o -> o * o).collect(Collectors.toList()));

		person.sort(Comparator.comparingDouble(Person::getSalary));
		person.forEach(System.out::println);

		System.out.println("================");
		person.sort(Comparator.comparingDouble(Person::getSalary).reversed());
		person.forEach(System.out::println);

		System.out.println("================");
		person.sort(Comparator.comparing(Person::getAge).reversed()
				.thenComparing(Comparator.comparing(Person::getSalary).reversed()));
		person.forEach(System.out::println);
		System.out.println("================");
		person.sort(Comparator.comparing(Person::getSalary).reversed()
				.thenComparing(Comparator.comparing(Person::getAge).reversed()));
		person.forEach(System.out::println);

	}

}
