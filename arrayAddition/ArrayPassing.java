package com.arrayAddition;

public class ArrayPassing {
	public static void add(int[]a) {
		int sum=0;
		for(int i:a) {
		  sum+=i;
		}
		System.out.print("Sum of Elements = "+sum);
	}
	public static void main(String[]args) {
		int arr[]= {10,27,37,7};
		add(arr);
	}
}
