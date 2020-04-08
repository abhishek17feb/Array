package com.abhishek.count.sort;

public class CountSort {

	public void sort( int[] item ) {
		
		int[] countArray = new int[item.length+1];
		for( int i=0; i<item.length ; i++ ) {
			int myItem = item[i];
			countArray[myItem]+=1;
		}
		
		int startingIndex = 0;
		for( int i=0; i<=countArray.length-1 ;i++ ) {
			if( countArray[i] > 0 ) {
				int numberOfOccurences = countArray[i];
				for( ;numberOfOccurences>0; numberOfOccurences-- ) {
					item[startingIndex++]=i;
				}
			}
		}
	
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		CountSort countSort = new CountSort();
		int[] arrayUnsorted = {1,5,2,4,5};
		countSort.sort(arrayUnsorted);
	}
	
}
