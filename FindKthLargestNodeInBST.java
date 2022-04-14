package com.algoexpert;


import java.util.ArrayList;

public class FindKthLargestNodeInBST {

	public static class BST {
		
		public int value;
		public BST left = null;
		public BST right = null;
		
		
		public BST(int value) {
			super();
			this.value = value;
		}
	}
	
	//Time complexity: O(n) | Space used is : O(n)
	public int findKthLargestNumberInBST(BST tree, int k) {
		ArrayList<Integer> inOrderTraversalSortedArray = new ArrayList<Integer>();
		inOrderTraversal(tree,inOrderTraversalSortedArray);
		int resultantIndexFromKthLargest = inOrderTraversalSortedArray.get(inOrderTraversalSortedArray.size()-k);
		return resultantIndexFromKthLargest;
		
	}

	public static void inOrderTraversal(BST node, ArrayList<Integer> outputArrayUsed) {
		if(node ==null) {
			return;
		}
		
		inOrderTraversal(node.left, outputArrayUsed);
		outputArrayUsed.add(node.value);
		inOrderTraversal(node.right, outputArrayUsed);
	}
	
	
	
	
}
