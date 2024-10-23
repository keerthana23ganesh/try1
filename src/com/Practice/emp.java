package com.Practice;

public class emp {


	private void payment() {
	System.out.println("payment type");

	}
	public  emp() {
	System.out.println("default const");
}
	public  emp(int age,String role) {
System.out.println("age"+age+"role"+role);
}
	public  emp(String name) {
	System.out.println("name"+name);
}
	public static void main(String[] args) {
emp e= new emp();
emp e1= new emp(27,"tester");
emp e2= new emp("keerthana");

	
	}
}
