package com.abhishek.queue.impl;

public class Queue {

	private int[] items = new int[5];

	private int headIndex = -1;

	private int tailIndex = -1;

	private int numberOfItems = 0;

	public void enqueue(int item) throws Exception {

		if (tailIndex == -1) {
			// Means the queue is empty
			tailIndex++;
			headIndex++;
		}

		if (numberOfItems > 0) {
			tailIndex++;
		}

		numberOfItems++;
		if (numberOfItems > items.length ) {
			throw new Exception("Queue is full");
		}

		items[tailIndex] = item;

	}
	
	public void dequeue() {
		
		if( headIndex == -1 ) {
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
		
		int dequeuedNumber = items[headIndex];
		headIndex++;
		System.out.println("Dequeued Item is " + dequeuedNumber);
	}

}
