package com.list;
import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    public LinkedList1() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the linked list is empty, set the new node as the head
            head = newNode;
        } else {
            // Traverse to the end of the linked list and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data +" ");
            current = current.next;
        }
       // System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();
        Scanner sc=new Scanner(System.in);
        int userInput;
        System.out.println("Enter elements to be added: ");
        while (true) {
            userInput = sc.nextInt();
            if (!sc.hasNextInt()){
            	linkedList.append(userInput);
                break;
            }

            linkedList.append(userInput);
        }
        // Displaying the linked list
      linkedList.display();
    }
}

