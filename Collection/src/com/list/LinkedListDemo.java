package com.list;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		ArrayList<Integer> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some list of Integers: ");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			list.add(Integer.valueOf(s[i]));
		}
		list.add(0,6);
		l.add(20);
		l.add(77);
		l.add(7);
		list.addAll(l);
		System.out.println("minimum element is "+Collections.min(list));
		System.out.println("maximum element is "+Collections.max(list));
		Collections.reverse(list);
		System.out.println("Reversed list "+list);
	}

}
