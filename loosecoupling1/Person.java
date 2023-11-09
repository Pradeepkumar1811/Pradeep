package com.loosecoupling1;
import java.util.*;
public class Person {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you want Bike Or Cycle?");
		String s=sc.next();
		Examination b=new Bike();
		Examination c=new Cycle();
		s=s.toLowerCase();
		if(s.equalsIgnoreCase("cycle")) {
			ChoiceOfGift g=new ChoiceOfGift(c);
			g.gift();
		}
		else if(s.equalsIgnoreCase("bike")) {
			ChoiceOfGift g=new ChoiceOfGift(b);
			g.gift();
		}
	}

}
