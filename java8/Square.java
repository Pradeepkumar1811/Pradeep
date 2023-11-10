package com.java8;
import java.lang.*;
public interface Square {
	public default void square(int a) {
		System.out.print("Square of Given Number:");
		System.out.println(a*a);
		cube(a);
		squareRoot(a);
	}
	private void cube(int a) {
		System.out.print("Cube of Given Number:");
		System.out.println(a*a*a);
	}
	private static void squareRoot(int a) {
		System.out.print("Square Root of Given Number:");
		System.out.println(Math.sqrt(a));
	}
}
