package com.list;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some list of Integers: ");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			list.add(Integer.valueOf(s[i]));
		}
		l.add(20);
		l.add(77);
		l.add(7);
		list.addAll(l);
		Collections.sort(list);
		System.out.println("After sorting: "+list);
		System.out.println("minimum element is "+Collections.min(list));
		System.out.println("maximum element is "+Collections.max(list));
		Collections.reverse(list);
		System.out.println("Reversed list "+list);
	}

}
