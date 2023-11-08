package com.MultipleInheritence;

public class Customer implements Car,Bike{
	public void speedOfBike() {
		System.out.println("Maximum Speed of Bike is 120");
	}
	public void mileageOfBike() {
		System.out.println("MileAge Of This Bike is 40/L");
	}
	public void speedOfCar() {
		System.out.println("Maximum Speed of Car is 200");
	}
	public void mileageOfCar() {
		System.out.println("MileAge Of This Car is 35/L");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.speedOfBike();
		c.mileageOfBike();
		c.speedOfCar();
		c.mileageOfCar();
	}
}
