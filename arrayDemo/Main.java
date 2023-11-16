package com.arrayDemo;

public class Main {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		for(int i=0;i<a.length;i++) {
			System.out.println("Element at Index:"+(i)+"="+a[i]);
		}
	}
}
