package com.abhishek.stack.impl;

public class SimpleArrayStackImpl implements Stack{

	private int lastInsertedIndex = -1;
	
	private int numberOfItems;
	
	private int maxElement;
	
	private int[] items = new int[10];
	
	@Override
	public void push(int item) {
		
		if( items.length == numberOfItems ) {
			throw new StackOverflowError("Cannot add more than this");
		}
		
		if( item > items[lastInsertedIndex] ) {
			maxElement = item;
		}
		
		items[++lastInsertedIndex] = item;
		numberOfItems++;
	}

	@Override
	public void pop() {
		if( numberOfItems == 0 ) {
			throw new IllegalAccessError("stack is empty");
		}
		
		lastInsertedIndex--;
		numberOfItems--;
		
	}
	
	@Override
	public void print() {
		
		if( numberOfItems == 0 ) {
			return;
		}
		
		for( int i =0 ; i<=lastInsertedIndex; i++ ) {
			System.out.println(items[i]);
		}
	}

	@Override
	public void maxElement() {
		
		
	}
}
