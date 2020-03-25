package com.abhishek.array;

import com.abhishek.array.impl.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Array list = new Array(2);
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(10);
		list.add(10);
		list.lastIndexOf(5);
	}
}
