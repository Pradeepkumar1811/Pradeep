package com.stringbuilderbuffer;

public class Builder {

	public static void main(String[] args) {
		     long stime=System.currentTimeMillis();
		     StringBuilder s=new StringBuilder("Hello ");
		     for(int i=0;i<100000;i++) {
		    	 s.append("World");
		     }
		     System.out.print(System.currentTimeMillis()-stime);
	}

}
