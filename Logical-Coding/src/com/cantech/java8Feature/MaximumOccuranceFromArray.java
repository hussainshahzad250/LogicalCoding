package com.cantech.java8Feature;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuranceFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 4, 2 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		System.out.println(map);
		Integer key = -1;
		int maxVall = -1;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxVall) {
				key = entry.getKey();
				maxVall = entry.getValue();
			}
		}

		System.out.println(key + " " + maxVall);
	}
}
