package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.FindClosestValueInBinarySearchTreeIterativeApproach;
import com.algoexpert.FindClosestValueInBinarySearchTreeIterativeApproach.BST;

public class FindClosestValueInBSTJUnitTest {

	@Test
	  public void TestCase1() {
	    BST root = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(10);
	    root.left = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(5);
	    root.left.left = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(2);
	    root.left.left.left = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(1);
	    root.left.right = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(5);
	    root.right = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(15);
	    root.right.left = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(13);
	    root.right.left.right = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(14);
	    root.right.right = new FindClosestValueInBinarySearchTreeIterativeApproach.BST(22);
	    
	    int expected = 13;
	    int actual = FindClosestValueInBinarySearchTreeIterativeApproach.findClosestValueInBinarySearchTree(root, 12);
	    Assertions.assertEquals(expected, actual);
  }
}
