package com.cantech.java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AA {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Type a number");
//		int num = sc.nextInt();

		// primeNumber(num);
		// System.out.println(factorial(num));
		// System.out.println(sum(num));
		// isArm("123");
		// sortList();
		 iterateMap();
		// reverserString();

	}

	private static int sum(int num) {
		if (num == 0)
			return 0;
		return num + sum(num - 1);
	}

	private static long factorial(long num) {
		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

	private static void iterateMap() {
		Map<String,Person> map = new HashMap<>();
		map.put("shahzad",new Person("sh", "abc",12,55000));
		map.put("abc",new Person("abcd", "xyz",12,42000));
		map.put("shahzad",new Person("shd", "abc",14,60000));
//		Map<Person, String> map = new HashMap<>();
//		map.put(new Person("sh", "abc"), "shahzad");
//		map.put(new Person("abcd", "xyz"), "abcd");
//		map.put(new Person("sh", "abc"), "shahzad");
//		Iterator<Person> iterator = map.keySet().iterator();
//		while (iterator.hasNext()) {
//			Person key = iterator.next();
//			System.out.println(map.get(key));
//		}
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " ");
			System.out.println(map.get(key));
		}
	}

	private static void sortList() {
		List<String> list = new ArrayList<>();
		list.add("shd");
		list.add("xyz");
		list.add("abc");
		list.add("yzx");
		list.add("ssd");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

	private static void isArm(String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = string.length() - 1; i >= 0; i--) {
			sb.append(string.charAt(i));
		}
		if (sb.toString().equals(string))
			System.out.println("arm");
		else
			System.out.println("not");

	}

	private static void primeNumber(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");

	}

	private static void reverserString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String s = sc.nextLine();
		// String s = "shahzad";
		StringBuffer sb = new StringBuffer();
		System.out.println(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			sb.append(charAt);
		}
		System.out.println(sb);
		System.out.println("done");

	}

}
