package com.taxcalculator;

class CountryNotValid extends Exception{
	CountryNotValid(String str){
		super(str);
	}
}
class EmployeeNotValid extends Exception{
	EmployeeNotValid(String str){
		super(str);
	}
}
class NotEligible extends Exception{
	NotEligible(String str){
		super(str);
	}
}
public class TaxCalculator{
		static double calculateTax(String name,double salary,boolean citizen) throws CountryNotValid,EmployeeNotValid,NotEligible{
			if(name.isEmpty()) {
				throw new EmployeeNotValid("*The employee name can't be empty*"); 
			}
			else if(!citizen) {
				throw new CountryNotValid ("*The employee should be an Indian citizen for calculating tax*");
			}
			else if(salary<10000) {
				throw new NotEligible("*The employee does not need to pay tax*");
			}
			else {
				double taxAmount=0;
				if(salary>100000) {
					taxAmount=(salary*8.0)/100.0;
				}
				else if(salary>=50000 && salary<100000) {
					taxAmount=(salary*6.0)/100.0;
				}
				else if(salary>=30000 && salary<50000) {
					taxAmount=(salary*5.0)/100.0;
				}
				else if(salary>=10000 && salary<30000) {
					taxAmount=(salary*4.0)/100.0;
				}
			   return taxAmount;
			}
		}
}
