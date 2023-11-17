package com.cognizant.shapes;
import java.util.*;
public class Circle {
	private float radius;
	private float pi;
	public Circle(){
		this(1.5f);
	}
	Circle(float radius) {
		this(radius,3.5f);
	}
	private Circle(float radius,float pi) {
		this.radius=radius;
		this.pi=pi;
	}
	public float calculateCircleArea(float radius) {
			return pi*radius*radius;
	}
	public float calculateCircumference(float radius) {
			return 2*pi*radius;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius value:");
		float radius =sc.nextFloat();
		Circle c=new Circle();
		System.out.println("Thrid Constructor");
		System.out.println("Area of Circle: "+c.calculateCircleArea(radius));
		System.out.println("Circumference Of Circle: "+c.calculateCircumference(radius));
	}
}
