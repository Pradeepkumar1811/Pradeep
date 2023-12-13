package com.exceptionhandling;
public class ThrowsKeyWord {
	public static void division(int a,int b)throws ArithmeticException{
		System.out.print(a/b);
	}

	public static void main(String[] args) {
		try {
			division(5,0);
		}
		catch(ArithmeticException e){
			System.out.print("Arithmetic Exception");
		}

	}

}
