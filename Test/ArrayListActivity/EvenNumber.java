package com.ArrayListActivity;
import java.util.*;
public class EvenNumber {
	public static ArrayList<Integer> storeEvenNumbers(int n){
		ArrayList<Integer> list1=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				list1.add(i);
			}
		}
	    return list1;
	}
	public static ArrayList<Integer> printEvenNumbers(ArrayList<Integer> list1){
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			list2.add(list1.get(i)*2);
		}
		return list2;
	}
	public static int retrieveEvenNumber(int N,ArrayList<Integer> list1) {
		if(list1.contains(N)) {
			return N;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int userInput=input.nextInt();
		if(userInput<2) {
			System.out.println("Number Should be Greater than 1");
		}
		System.out.println("Even Numbers After mulitiple by 2: ");
		System.out.println(printEvenNumbers(storeEvenNumbers(userInput)));
		System.out.println("After retireving number: ");
		System.out.println(retrieveEvenNumber(userInput,storeEvenNumbers(userInput)));
		input.close();
	}

}
