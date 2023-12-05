package com.taxcalculator;
import java.util.*;
public class CalculatorSimulator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Your Name :");
		String empName=scanner.nextLine();
		System.out.print("Enter true if you are an indian or Enter False :");
		boolean isIndian=scanner.nextBoolean();
		System.out.print("Enter your salary :");
		double empSalary=scanner.nextDouble();
		try {
			System.out.print(empName+" your tax amount is "+TaxCalculator.calculateTax(empName,empSalary,isIndian));
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
