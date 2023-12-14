package com.comparableDemo;
public class Student implements Comparable<Student>{
	private int rollNo;
	private String name; 
	private int age;
	Student(int rollNo,String name,int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int compareTo(Student student) {
		return this.rollNo-student.rollNo;
	}
	public String toString() {
		return "Student [Name=" + name + ", Rollno=" + rollNo + ", Age=" + age + "]";
	}
}
