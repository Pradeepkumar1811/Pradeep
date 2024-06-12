package com.pointerex;

import java.awt.Point;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		int x,y;
		Point point1=new Point(x=1,y=1);
		//copied by refernce
		Point point2=point1;
		//new memory allocated for point3
		Point point3=new Point(point1);
		point1.x=2;
		System.out.println(point2+" "+point3);
		
		//Escape sequence
		//for double quote
		System.out.println("Hello \"Pradeep\"");
		//for \
		System.out.println("c:\\windows\\");
		// for next line
		System.out.println("c:\nwindows\\");
		// for tab
		System.out.println("c:\twindows\\");
		
		//final variable can not change value once initialized
		final float PI=3.14F;
		
		//number formatting
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String result=currency.format(450000);
		System.out.print(result);

	}

}
