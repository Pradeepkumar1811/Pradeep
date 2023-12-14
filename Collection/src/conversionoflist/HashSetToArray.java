package com.conversionoflist;
import java.util.*;
public class HashSetToArray {	 
    public static void main(String[] args) {
    	//Create HashSet object
    	HashSet<String> hashSet = new HashSet<String>();
        //Add elements to HashSet
    	hashSet.add("Dhoni");
    	hashSet.add("Ruturaj");
    	hashSet.add("Conway");
    	hashSet.add("Rahane");
    	hashSet.add("Raina");
    	System.out.println("HashSet: " + hashSet);
    	String[] strArray = new String[hashSet.size()];
    	hashSet.toArray(strArray);
        System.out.println("Array created:");
        for(String str:strArray){
             System.out.println(str);
        }
    }
}
