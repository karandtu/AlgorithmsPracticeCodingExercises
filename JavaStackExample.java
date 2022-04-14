package com.algoexpert;

//import java.util.Iterator;
import java.util.Stack;


public class JavaStackExample {

	public static void main(String args[]) {
	Stack<String> stack = new Stack<>();
	
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	
	/**
	Iterator<String> iterator = stack.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	*/
	
	/**
	//using enhanced for-loop
	for(String element : stack) {
		System.out.println(element);
	}
	
	*/
	
	//Java streams
	stack.stream().forEach((element)-> { 
		System.out.println(element); 
		});
	}
	
	
	
}
