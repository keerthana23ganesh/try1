package com.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PracStrings {
public static void main(String[] args) {
List<Integer> l=new ArrayList<>();
l.add(100);
l.add(100);
l.add(100);
l.add(201);
l.add(102);
l.add(202);



System.out.println(l);
Set<Integer>s=new HashSet<>();
s.addAll(l);
System.out.println(s);
int size = s.size();

System.out.println(size);
for (Integer integer : s) {
	System.out.println(integer);
}

Map<String, Integer> m= new HashMap<String, Integer>();

m.put("sql", 10);
m.put("java", 20);
m.put("swlwnium", 30);
m.put("api", 10);
int size2 = m.size();
System.out.println(size);
m.keySet();
System.out.println(m);
boolean empty = m.isEmpty();
System.out.println(empty);
m.values();
System.out.println(m);
boolean containsKey = m.containsKey(m);
System.out.println(containsKey);










}
}
