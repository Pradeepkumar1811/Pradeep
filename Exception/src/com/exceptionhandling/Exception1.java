package com.exceptionhandling;
import java.util.*;
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.print(c);
		}
		catch(ArithmeticException e) {
			System.out.print(e.toString());
		}
		finally{
			System.out.print("Exception not handled here");
		}

	}

}
