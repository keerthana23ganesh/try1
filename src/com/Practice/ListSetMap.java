package com.Practice;

import java.util.LinkedList;
import java.util.List;

public class ListSetMap {
public static void main(String[] args) {
	List<Integer>l=new LinkedList<Integer>();
	l.add(30);
	l.add(20);
	l.add(10);
	l.add(40);
	System.out.println(l);
	
	List<Integer>l2=new LinkedList<Integer>();
	l2.addAll(l);
	l2.add(20);
	l2.add(30);
	l2.add(100);
	System.out.println(l2);
	
	int indexOf = l2.indexOf(40);
	System.out.println(indexOf);
	
	int lastIndexOf = l2.lastIndexOf(30);
	System.out.println(lastIndexOf);
//	
//	l2.retainAll(l);
//	System.out.println(l2);
	
//	l2.removeAll(l);
//	System.out.println(l2);
	
	for (int i = 0; i < l2.size(); i++) {
		System.out.println(l2.get(i));
		
	}
	
	
	
}
}
