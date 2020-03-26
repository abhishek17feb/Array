package com.abhishek.stack;

import com.abhishek.stack.impl.SimpleArrayStackImpl;
import com.abhishek.stack.impl.Stack;

public class MyStackDemo {

	public static void main(String[] args) {
		Stack stack = new SimpleArrayStackImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.print();
	}
	
}
