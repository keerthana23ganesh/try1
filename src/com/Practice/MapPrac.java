package com.Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPrac {
	public static void main(String[] args) {
		Map<String,Integer> m=new Hashtable<String, Integer>();
		m.put("java", 10);
		m.put("python", 20);
		m.put("sql", 30);
		m.put("sql", 40);
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		Integer integer = m.get("java");
		System.out.println(integer);
		Integer put = m.put("manual", 50);
		System.out.println(m);
		boolean containsKey = m.containsKey("sql");
		System.out.println(containsKey);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Integer remove = m.remove("sql");
		System.out.println(remove);
//		m.clear();
//		System.out.println(m);
		Set<Entry<String,Integer>> entry=m.entrySet();
		for (Entry<String, Integer> x : entry) {
			System.out.println(x);
			
		}
		 
		
		
		
		
	}
	

}
