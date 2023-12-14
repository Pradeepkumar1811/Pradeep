package com.comparableDemo;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(111,"abc",20));
		students.add(new Student(110,"def",21));
		students.add(new Student(108,"ghi",19));
		students.add(new Student(107,"jkl",20));
		students.add(new Student(112,"klm",18));
		System.out.println("Before sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
		Collections.sort(students);
		System.out.println("After sorting: ");
		for(Student student:students) {
			System.out.println(student);
		}
	}

}
