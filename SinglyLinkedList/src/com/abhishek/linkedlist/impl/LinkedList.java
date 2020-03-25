package com.abhishek.linkedlist.impl;

public class LinkedList {

	private class Node {
		
		private int item;
		
		private Node next;
		
		public Node( int item ) {
			this.item = item;
		}
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public void add( int item ) {
		
		Node newNode = new Node(item);
		if( head == null ) {
			head = tail = newNode;
			count++;
			return;
		}
		
		Node currentNode = this.head;
		while(true) {
			if( currentNode.next == null ) {
				currentNode.next = newNode;
				tail = newNode;
				break;
			}
			currentNode = currentNode.next;
		}
		count++;
	}
	
	public void remove( int index ) {
		
		int currentIndex = 0;
		//Node currentNode = this.head;
		while(true) {
			if( index == currentIndex ) {
				Node previousNode = findNode(currentIndex-1);
				Node nextNode = findNode(currentIndex+1);
				previousNode.next = nextNode;
				break;
			}
			currentIndex++;
		}
		count--;
	}
	
	private Node findNode( int index ) {
		Node currentNode = this.head;
		int currentIndex = 0;
		while(true) {
			if( currentIndex == index ) {
				return currentNode;
			}
			
			currentIndex++;
			currentNode = currentNode.next;
		}
	}
	
	public int find(int index) {
		
		int currentIndex = 0;
		Node currentNode = this.head;
		
		if( index == 0 ) {
			return currentNode.item;
		}
		
		currentIndex ++;
		currentNode = currentNode.next;
		while( true ) {
			if( currentIndex == index ) {
				return currentNode.item;
			}
			
			currentIndex++;
			currentNode = currentNode.next;
		}
	}
	
	public void removeFirst() {
		Node firstNode = this.head;
		Node secondNode = firstNode.next;
		this.head = secondNode;
		count--;
	}
	
	public void removeLast() {
		
		Node secondLastNode = findNode(count-2);
		this.tail = secondLastNode;
		this.tail.next = null;
		count--;
	}
}
