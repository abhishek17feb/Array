package com.abhishek.linkedlist;

import com.abhishek.linkedlist.impl.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.removeLast();
		System.out.println(myList.find(2));
	}
}
