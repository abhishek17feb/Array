package com.abhishek.queue;

import com.abhishek.queue.impl.Queue;

public class QueueDemo {

	public static void main(String[] args) throws Exception {
		
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println("Done");
	}
}
