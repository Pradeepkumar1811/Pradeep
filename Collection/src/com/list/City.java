package com.list;
import java.util.*;
public class City {
	private String district;
	private int pincode;
	City(String dist,int pincode){
		this.district=dist;
		this.pincode=pincode;
	}
	public static void display(HashSet<City>cities) {
		System.out.println("Entered cities are: ");
		for(City city:cities) {
			System.out.println(city.district+" "+city.pincode);
		}
	}
	public static void main(String[] args) {
		HashSet<City> cities=new HashSet<City>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of data you need to provide: ");
		int user=input.nextInt();
		for(int i=0;i<user;i++) {
			System.out.print("Enter District Name: ");
			String district=input.next();
			System.out.print("Enter Pincode of it: ");
			int pincode=input.nextInt();
			cities.add(new City(district,pincode));
		}
		display(cities);
	}
}
