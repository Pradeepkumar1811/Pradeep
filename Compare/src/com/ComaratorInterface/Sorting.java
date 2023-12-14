package com.ComaratorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Sorting {

	public static void main(String[] args) {
		ArrayList<Emp> a1=new ArrayList<Emp>();
		
		a1.add(new Emp(101,123,"satish"));
		a1.add(new Emp(109,124,"latha"));
		a1.add(new Emp(106,124,"yashwanth"));
		a1.add(new Emp(107,129,"prdeep"));
		
	
		System.out.println("unsorted="+a1);
		Collections.sort(a1,new NameSorting());
		System.out.println(a1);
		Collections.sort(a1,new IDSorting());
		System.out.println(a1);
	}
}
