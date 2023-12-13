package com.list;
import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<String> list1=new LinkedHashSet<String>();
		LinkedHashSet<String> list2=new LinkedHashSet<String>();
		list1.add("Dhoni");
		list1.add("Kohli");
		list1.add("Styne");
		list1.add("Rohit");
		list1.add("Sachin");
		list1.add("Raina");
		System.out.println("First list: "+list1);
		list2.add("Dhoni");
		list2.add("Raina");
		list2.add("Sachin");
		System.out.println("Second list: "+list2);
		System.out.println("Whether list1 contains list2? "+list1.containsAll(list2));
		list1.removeAll(list2);
		System.out.println("After removing list1 elements present in list2: "+list1);
		list2.removeAll(list2);
		System.out.println("Whether list2 is empty? "+list2.isEmpty());
	}

}
