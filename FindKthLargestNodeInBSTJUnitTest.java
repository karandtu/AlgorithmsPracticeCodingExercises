package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.FindKthLargestNodeInBST;

public class FindKthLargestNodeInBSTJUnitTest {

	 @Test
	  public void TestCase1() {
		FindKthLargestNodeInBST.BST root = new FindKthLargestNodeInBST.BST(15);
	    root.left = new FindKthLargestNodeInBST.BST(5);
	    root.left.left = new FindKthLargestNodeInBST.BST(2);
	    root.left.left.left = new FindKthLargestNodeInBST.BST(1);
	    root.left.left.right = new FindKthLargestNodeInBST.BST(3);
	    root.left.right = new FindKthLargestNodeInBST.BST(5);
	    root.right = new FindKthLargestNodeInBST.BST(20);
	    root.right.left = new FindKthLargestNodeInBST.BST(17);
	    root.right.right = new FindKthLargestNodeInBST.BST(22);
	    int k = 3;
	    int expected = 17;
	    int actual = new FindKthLargestNodeInBST().findKthLargestNumberInBST(root, k);
	    Assertions.assertTrue(expected == actual);
	  }
}
