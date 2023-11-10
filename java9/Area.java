package com.java9;

public interface Area {
	public default void areaOfCircle(int r) {
		System.out.print("Area Of Circle:");
		System.out.println((double)3.14*r*r);
	}
	public default void area(int l,int b,int base,int h) {
		areaOfRectangle(l,b);
		areaOfTriangle(base,h);
	}
	private void areaOfRectangle(int l,int b) {
		System.out.print("Area Of Rectangle:");
		System.out.println(l*b);
	}
	private static void areaOfTriangle(int b,int h) {
		System.out.print("Area Of Triangle:");
		System.out.println((double)0.5*b*h);
	}
}
