package com.abhishek.array.impl;

public class Array {

	private int[] items;
	
	private int count;
	public Array(int size) {
		items = new int[size];
	}
	
	public void add( int value ) {
		
		if( count == 0 ) {
			this.items[count++] = value;
			return;
		}
		
		if( count == items.length ) {
			int[] newArray = new int[count*2];
			for( int i =0; i< count ;i++ ) {
				newArray[i] = items[i];
			}
			items = newArray;
		}
		
		items[count++] = value;
	}
	
	public void print() {
		
		for( int i=0 ; i< count ; i++ ) {
			System.out.println(items[i]);
		}
	}
	
	public void remove(int index) {
		
		for( int i = index ; i<count ;i++ ) {
			if( items[i+1] != 0 )
			items[i] = items[i+1];
		}
		
		count--;
	}
	
	public void indexOf(int value) {
		
		for( int i = 0 ;i <count ; i++ ) {
			if( value == items[i] ) {
				System.out.println("Index of "+ value + " is  " + i);
				return;
			}
		}
		System.out.println("Item not present");
	}
	
	public void lastIndexOf( int value ) {
		
		int lastIndex = 0;
		boolean itemFound = false;
		for( int i=0;i<count;i++ ) {
			if( value == items[i] ) {
				lastIndex=i;
				itemFound = true;
			}
		}
		
		if( itemFound ) {
			System.out.println("Last index of ["+value+"] is ["+ lastIndex +"]");
		} else {
			System.out.println("Item not found");
		}
	}
}
