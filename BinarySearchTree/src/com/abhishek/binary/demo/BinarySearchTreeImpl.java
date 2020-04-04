package com.abhishek.binary.demo;

import com.abhishek.binary.impl.BinarySearchTree;

public class BinarySearchTreeImpl {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		
		tree.find(100);
	}
	
}
