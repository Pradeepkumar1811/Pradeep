package com.conversionoflist;
import java.util.*;
public class LinkedListToArrayList {

    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(10);
        linkedList.add(19);
        linkedList.add(11);
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}
