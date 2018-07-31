package com.cantech.java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentExample {

	
	
	public static void main(String[] args) {

		// ConcurrentHashMap
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("1", "1");
		map.put("2", "1");
		map.put("3", "1");
		map.put("4", "1");
		map.put("5", "1");
		map.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: " + map);
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("3"))
				map.put(key + "new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: " + map);

		// HashMap
//		map = new HashMap<String, String>();
//		map.put("1", "1");
//		map.put("2", "1");
//		map.put("3", "1");
//		map.put("4", "1");
//		map.put("5", "1");
//		map.put("6", "1");
//		System.out.println("HashMap before iterator: " + map);
//		Iterator<String> it1 = map.keySet().iterator();
//		while (it1.hasNext()) {
//			String key = it1.next();
//			if (key.equals("3"))
//				map.put(key + "new", "new3");
//		}
//		System.out.println("HashMap after iterator: " + map);
		
		
		List<String> names = new ArrayList<>();
		names.add("shahad");
		names.add("hussain");
		names.add("jdh");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		
	}

}
