package com.abhishek.binary.search;

public class BinarySearch {

	public int search( int item, int[] list ) {
		
		int low = 0;
		int high = list.length-1;
		while( low <= high ) {
			
			int middle = (low+high)/2;
			if( list[middle] == item ) {
				return middle;
			} 
			
			if( item > list[middle] ) {
				low = middle+1;
			}
			
			if( item < list[middle] ) {
				high = middle-1;
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		int[] list = {12,56,78,256,35};
		BinarySearch binary = new BinarySearch();
		System.out.println(binary.search(39, list));
	}
}
