package com.algoexpert;

public class RemoveDuplicatesFromLinkedList {

	
	// This is an input class. Do not edit.
	  public static class LinkedList {
	    public int value;
	    public LinkedList next;

	    public LinkedList(int value) {
	      this.value = value;
	      this.next = null;
	    }
	  }

	  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
	    LinkedList currentNode = linkedList;
	   while(currentNode!= null) {
		   LinkedList nextDifferentNode = currentNode.next;
		   while (nextDifferentNode!=null && nextDifferentNode.value == currentNode.value) {
			   nextDifferentNode = nextDifferentNode.next;
		   }
		   currentNode.next = nextDifferentNode;
		   currentNode = nextDifferentNode;
		   
	   }
	return linkedList;
	  }
	
}
