package com.multiDimesionalArray;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int a[]:arr1) {
			for (int j:a) { 
				System.out.print(j+" ");
			}
				System.out.println();
		}
	}
}

