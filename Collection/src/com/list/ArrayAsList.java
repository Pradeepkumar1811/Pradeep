package com.list;
import java.util.*;
public class ArrayAsList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []str= {"java","HTML","spring","CSS"};
		Arrays.sort(str);
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str));
		System.out.println(list);
	}

}
