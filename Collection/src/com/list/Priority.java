package com.list;
import java.util.*;
public class Priority {
    public static void main(String args[]) {
     PriorityQueue<String> q1=new PriorityQueue<String>();
     q1.add("java");
     q1.add("html");
     q1.offer("css");
     q1.add("sql");
     System.out.println(q1);
     System.out.println(q1.remove());
     System.out.println("After remove method: "+q1);
     System.out.println("Element method: "+q1.element());
     System.out.println("Peek Method: "+q1.peek()); 
    }
}
