package com.interfaceTest;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kidUser1=new KidUsers(10,"Kids");
		kidUser1.registerAccount();
		kidUser1.requestBook();
		
		KidUsers kidUser2=new KidUsers(18,"Fiction");
		kidUser2.registerAccount();
		kidUser2.requestBook();
		
		AdultUsers adultUser1=new AdultUsers(5,"Kids");
		adultUser1.registerAccount();
		adultUser1.requestBook();
		
		AdultUsers adultUser2=new AdultUsers(23,"Fiction");
		adultUser2.registerAccount();
		adultUser2.requestBook();
	}
}
