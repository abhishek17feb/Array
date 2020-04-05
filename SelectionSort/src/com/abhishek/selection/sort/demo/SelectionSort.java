package com.abhishek.selection.sort.demo;

public class SelectionSort {

	int[] myItems;
	
	public void sort( int[] items ) {
		
		int itemReplaceIndex = 0;
		int unsortedIndex = 0;
		
		while( unsortedIndex < items.length -1 ) {
			//Finding the minimum number
			int minimumNumberIndex = 0;
			int minimumNumber = items[unsortedIndex];
			
			for( int i=unsortedIndex;i<items.length;i++ ) {
				if( items[i] < minimumNumber ) {
					minimumNumber = items[i];
					minimumNumberIndex = i;
				}
			}
			
			int temp = items[minimumNumberIndex];
			items[minimumNumberIndex] = items[itemReplaceIndex];
			items[itemReplaceIndex++] = temp;
			unsortedIndex++;
		}
		
		myItems = items;
	}
	
	public void print() {
		for( int i =0 ;i<myItems.length;i++ ) {
			System.out.println(myItems[i]);
		}
	}
	
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] items = {5,8,2,10,1};
		selectionSort.sort(items);
		selectionSort.print();
	}
	
}
