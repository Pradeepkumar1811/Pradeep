package com.list;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		HashSet<Integer> set3=new HashSet<>();
		set1.add(10);
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		System.out.println("set1 :"+set1);
		set2.add(1);
		set2.add(2);
		set2.add(4);
		set2.add(7);
		set2.add(9);
		System.out.println("set2 :"+set2);
		set3.addAll(set1);
		set3.addAll(set2);
		System.out.println("Union of two sets: "+set3);
		set1.retainAll(set2);
		System.out.println("Intersection of set1 & set2: "+set1);
		
	}

}
