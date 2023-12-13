package com.HashMapactivity;
import java.util.*;
public class Country {
	HashMap<String,String> countryMap1=new HashMap<>();
	HashMap<String,String> countryMap2=new HashMap<>();
	public HashMap<String,String> storeCountry(String countryName,String capitalName){
		countryMap1.put(countryName, capitalName);
		return countryMap1;
	}
	public HashMap<String,String> storeCapital(String capitalName,String countryName){
		countryMap2.put(capitalName,countryName);
		return countryMap2;
	}
	public String retrieveCapitalName(String capitalName){
		if(countryMap1.containsValue(capitalName)) {
			return countryMap1.get(capitalName);
		}
		else {
			return countryMap1.get(capitalName);
		}
	}
	public String retrieveCountryName(String countryName){
		if(countryMap2.containsValue(countryName)) {
			return countryMap2.get(countryName);
		}
		else {
			return countryMap2.get(countryName);
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Country country=new Country();
		System.out.println("Enter the number of countries to add: ");
		int userInput=input.nextInt();
		input.nextLine();
		for(int i=0;i<userInput;i++) {
			System.out.println("Enter CountryName: ");
			String countryName=input.nextLine();
			System.out.println("Enter CapitalName: ");
			String capitalName=input.nextLine();
			country.storeCountry(countryName, capitalName);
			country.storeCapital(capitalName, countryName);
		}
		System.out.println("Enter a countryName to find capital: ");
		String cname=input.nextLine();
		System.out.println("*Capital of "+cname+" is "+country.retrieveCapitalName(cname)+"*");
		System.out.println("Enter a CapitalName to find country: ");
		String capName=input.nextLine();
		System.out.println("*"+country.retrieveCountryName(capName)+" is country of "+capName+"*");
	}

}
