package com.abhishek.bubble.impl;

public class BubbleSortAlgorithm {

	private int[] myItems;
	
	private int numberOfItems;
	
	public BubbleSortAlgorithm(int length) {
		myItems = new int[length];
	}
	
	public void addElements( int item ) {
		if( numberOfItems == myItems.length ) {
			throw new ArrayStoreException("Array is full");
		}
		myItems[numberOfItems++] = item;
	}
	
	public void sort() {
		
		for( int i=0 ; i<myItems.length; i++ ) {
			
			for( int j=0; j<myItems.length-1 ; j++ ) {
				
				int firstPointer = j;
				int secondPointer = j+1;
				
				if( myItems[firstPointer] > myItems[secondPointer] ) {
					int temp = myItems[secondPointer];
					myItems[secondPointer] = myItems[firstPointer];
					myItems[firstPointer] = temp;
				}
				
			}
			
		}
		
	}
	
	public void print() {
		for( int i =0 ;i<myItems.length;i++ ) {
			System.out.println(myItems[i]);
		}
	}
	
	public static void main(String[] args) {
		
		BubbleSortAlgorithm bubble = new BubbleSortAlgorithm(7);
		bubble.addElements(5);
		bubble.addElements(8);
		bubble.addElements(2);
		bubble.addElements(10);
		bubble.addElements(1);
		bubble.addElements(3);
		bubble.addElements(14);
		
		bubble.sort();
		bubble.print();
		
	}
	
}
