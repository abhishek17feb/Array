package com.abhishek.binary.impl;

public class BinarySearchTree {

	private class Node{
		
		private Node leftChild;
		private int value;
		private Node rightChild;
		
		Node( int value ){
			this.value = value;
		}
	}
	
	private Node rootNode;
	
	public void insert(int value) {
		Node newNode = new Node(value);
		if( rootNode == null ) {
			rootNode = newNode;
			return;
		}
		
		Node currentNode = this.rootNode;
		while(true) {
			if( value < currentNode.value ) {
				if( currentNode.leftChild == null ) {
					currentNode.leftChild = newNode;
					break;
				}
				currentNode = currentNode.leftChild;
			} else if ( value > currentNode.value ) {
				if( currentNode.rightChild == null ) {
					currentNode.rightChild  = newNode;
					break;
				}
				currentNode = currentNode.rightChild;
			}
		}
	}
	
	
	public void find(int value) {
		
		Node currentNode = this.rootNode;
		if( currentNode.value == value ) {
			System.out.println("Element found at root node " + value);
			return;
		}
		
		while( true ) {
			if( value < currentNode.value ) {
				currentNode = currentNode.leftChild;
				if( currentNode.value == value ) {
					System.out.println("Element found in left subtree");
					break;
				} else if( currentNode.leftChild == null ) {
					System.out.println("Element not found");
					break;
				}
			}
			else if( value > currentNode.value ) {
				currentNode = currentNode.rightChild;
				if( currentNode.value == value ) {
					System.out.println("Element found in right subtree");
					break;
				} else if( currentNode.rightChild == null ) {
					System.out.println("Element not found");
					break;
				}
			}
		}
	}
}
