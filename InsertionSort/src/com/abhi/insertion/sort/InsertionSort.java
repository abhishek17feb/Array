package com.abhi.insertion.sort;

public class InsertionSort {

	public void sort( int item[] ) {
		
		for( int i=0; i<item.length; i++ ) {
			int element = item[i];
			int elementIndex = i;
			for( int j=i-1; j>=0; j-- ) {
				if( element < item[j] ) {
					item[elementIndex] = item[j];
					item[j] = element;
					elementIndex--;
				}
			}
		}
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] myList = {5,2,8,10,1};
		insertionSort.sort(myList);
		System.out.println("done");
	}
	
}
