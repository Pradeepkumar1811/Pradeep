package com.arrayAsObject;

public class Main {

	public static void main(String[] args) {
		Employee employee[]=new Employee[3];
		employee[0]=new Employee(1001,"abc","kerala");
		employee[1]=new Employee(1002,"pqr","bengalore");
		employee[2]=new Employee(1003,"suv","chennai");
		for(Employee i:employee) {
			System.out.println(i.id+" "+i.name+" "+i.location);
		}
	}
}
