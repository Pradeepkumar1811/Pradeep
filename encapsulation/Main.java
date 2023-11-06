package com.encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee d=new Employee();
		d.name="Pradeep";
		d.deptName="Developer";
		d.location="Chennai";
		d.setId(1117);
		System.out.println(d.name);
		System.out.println(d.deptName);
		System.out.println(d.location);
		System.out.println(d.getId());

	}

}
