package com.abhishek.circular.queue.impl;

public class CircularQueue {

	private int[] items = new int[5];
	
	private int numberOfItems;
	
	private int freeSlots;
	
	private int head;
	
	private int tail;
	
	public CircularQueue() {
		head = tail = -1;
		freeSlots = items.length;
		numberOfItems = 0;
	}
	
	public void enqueue(int item) throws Exception{
		
		//Queue is full condition
		if( numberOfItems == items.length ) {
			throw new Exception("Queue is full");
		}
		
		//Queue is empty condition
		if( numberOfItems == 0 ) {
			tail = head = 0;
		}
		
		//calculateFreeSlots();
		
		//Queue head is at last index and free slots are available
		if( freeSlots > 0 && (tail == items.length) ) {
			tail = 0;
		}
		
		items[tail++] = item;
		numberOfItems++;
		freeSlots--;
	}
	
	public void dequeue() throws Exception{
		
		//If queue is empty
		if( numberOfItems == 0 ) {
			throw new IllegalAccessException("Queue is empty");
		}
		
		if( numberOfItems > 0 && head == -1  ) {
			head++;
		}
		
		//If head is at the last index and if there are items remaining to read from start
		if( head == items.length && numberOfItems > 0) {
			head = 0;
		}
		
		int item = items[head++];
		System.out.println("Item dequequed is " + item);
		numberOfItems--;
		freeSlots++;
		//calculateFreeSlots();
	}
	
	private void calculateFreeSlots() {
		freeSlots = (items.length-1) - numberOfItems;
	}
	
}
