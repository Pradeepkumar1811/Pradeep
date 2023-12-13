package com.exceptionhandling;
import java.util.*;
class InvalidException extends Exception
{
	InvalidException(String s){
		super(s);
	}
}
public class UserDefineException{
	static void checkRegistration(int reg_no)throws InvalidException {
		if(reg_no!=101 && reg_no!=102 && reg_no!=103) {
			throw new InvalidException("You Have not Registered Yet!");
		}
		else {
			System.out.print("Welcome!");
		}
		
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Register Number:");
		int reg_no=sc.nextInt();
		try {
			checkRegistration(reg_no);
		}
		catch(InvalidException i) {
			System.out.print("Exception Caught");
			System.out.print(i);
		}
		System.out.print("Completed");
	}
}
