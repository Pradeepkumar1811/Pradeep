package com.HasSetActivity;
import java.util.*;
public class Country {
	HashSet<String> countries=new HashSet<>();
	public HashSet<String> storeCountryNames(String countryName){
		countries.add(countryName);
		return countries;
	}
	public String retrieveCountry(String country) {
		if(countries.contains(country)) {
			return country;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Country c=new Country();
		System.out.println("Enter the number of countries to add: ");
		int userInput=input.nextInt();
		input.nextLine();
		for(int i=0;i<userInput;i++) {
			String countryName=input.nextLine();
			c.storeCountryNames(countryName);
		}
		System.out.println("Given countries are: ");
		System.out.println(c.countries);
		System.out.println("Enter a countryname to check is it present: ");
		String country=input.nextLine();
		System.out.println(c.retrieveCountry(country)+" is present");
		input.close();
	}

}
