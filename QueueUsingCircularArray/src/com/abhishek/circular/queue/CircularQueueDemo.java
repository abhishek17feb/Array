package com.abhishek.circular.queue;

import com.abhishek.circular.queue.impl.CircularQueue;

public class CircularQueueDemo {

	public static void main(String[] args) throws Exception{
		
		CircularQueue queue = new CircularQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);
	}
	
}
