package com.interfaceDemo;

public class Account implements Bank,Loan{
	public void credit() {
		System.out.println("Amount credited is 5000");
	}
	public void debit() {
		System.out.println("Amount debited is 1000");
	}
	public void loan() {
		System.out.println("Loan in bank is 50000");
	}
	public static void main(String[] arg) {
		Account a=new Account();
		a.credit();
		a.debit();
		a.loan();
	}

}
