package com.stringbuilderbuffer;

public class Buffer {

	public static void main(String[] args) {
	     long stime=System.currentTimeMillis();
	     StringBuffer s=new StringBuffer("Hello ");
	     for(int i=0;i<100000;i++) {
	    	 s.append("World");
	     }
	     System.out.print(System.currentTimeMillis()-stime);
	}

}
