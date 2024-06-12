package com.mortgage_calculator;
import java.text.NumberFormat;
import java.util.*;
public class MortgageCalculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int principal;
		double interest;
		int period;
		while(true) {
			System.out.print("Principal ($1K - $1M): ");
			principal=scanner.nextInt();
			if(principal>=1000 && principal<=1000000)
				break;
			System.out.println("Enter a value between 1K and 1M");
		}
		
		while(true) {
			System.out.print("Annual Interest Rate: ");
			interest=scanner.nextDouble();
			if(interest>0 && interest<=30)
				break;
			System.out.println("Enter a value between 0 - 30");
		}
		
		
		while(true) {
			System.out.print("Period (Years): ");
			period=scanner.nextInt();
			if(period>=1 && period<=30)
				break;
			System.out.println("Enter a value between 1 and 30");
		}
		interest=interest/100/12;
		period=period*12;
	    double rate=Math.pow((1+interest),period);
	    double mortage=principal*((interest*rate)/(rate-1));
	    Locale loc = new Locale("hi", "IN"); 
	    String money=NumberFormat.getCurrencyInstance(loc).format(mortage);
	    System.out.println("Mortgage: "+money);
		
		
	}

}
