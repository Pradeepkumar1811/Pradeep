package com.superKeyWord;

public class Student extends Person {
	
    String name =super.name;
    String course = "JavaFullStack";

    Student(){
        super();
    }

    public void msg(){
        System.out.println(name + " " + course);
    }
    
    public void display()
    {
    	super.display();
    }

    
}
