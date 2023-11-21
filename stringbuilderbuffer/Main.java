package com.stringbuilderbuffer;

public class Main {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Let's");
		str.append(" hope for best");
		str.replace(14, 14, " the");
		str.reverse();
		str.reverse();
		System.out.println(str+" "+str.capacity());
		System.out.println(str.delete(1, 3));
		StringBuilder s=new StringBuilder("");
		s.delete(0, 3);
		System.out.print(s);

	}

}
