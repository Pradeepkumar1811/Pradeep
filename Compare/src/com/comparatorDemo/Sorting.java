package com.comparatorDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Sorting{
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(new Student(111,"abc",20));
		students.add(new Student(110,"def",21));
		students.add(new Student(108,"ghi",19));
		students.add(new Student(107,"jkl",20));
		students.add(new Student(112,"klm",18));
		System.out.println("Before sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
		Collections.sort(students,new AgeSorting());
		System.out.println("After Age sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
		Collections.sort(students,new NameSorting());
		System.out.println("After Name sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
		Collections.sort(students,new RollNoSorting());
		System.out.println("After RollNumber sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
	}

}
