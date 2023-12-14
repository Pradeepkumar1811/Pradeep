package com.comparatorDemo;
public class Student{
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
	public void setRollNo(int roll) {
		this.rollNo=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String toString() {
		return "Student [Name=" + name + ", Rollno=" + rollNo + ", Age=" + age + "]";
	}
}
