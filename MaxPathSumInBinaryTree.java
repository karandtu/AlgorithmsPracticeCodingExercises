package com.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPathSumInBinaryTree {
	public static List<Integer> findMaxPathSum(BinaryTree tree){
		List<Integer> listObject = findMaxSum(tree);
		return listObject;
	}

	
	
	
	
	public static List<Integer> findMaxSum(BinaryTree tree) {
		if(tree == null) {
			return new ArrayList<Integer>(Arrays.asList(0,Integer.MIN_VALUE));
		}
		
		List<Integer> leftSumArray = findMaxSum(tree.left);
		Integer leftMaxSumAsBranch = leftSumArray.get(0);
		Integer leftMaxSumAsTriangle = leftSumArray.get(1);
		
		List<Integer> rightSumArray = findMaxSum(tree.right);
		Integer rightMaxSumAsBranch = rightSumArray.get(0);
		Integer rightMaxSumAsTriangle = rightSumArray.get(1);
		
		
		Integer maxChildSumAsBranch = Math.max(leftMaxSumAsBranch, rightMaxSumAsBranch);
		Integer maxSumAsBranch = Math.max(maxChildSumAsBranch+tree.value,tree.value);
		Integer maxSumAsBranchAsInRootNodeTriangle = Math.max(maxSumAsBranch, leftMaxSumAsBranch+tree.value+rightMaxSumAsBranch);
		Integer runningMaxPathAsSum = Math.max(maxSumAsBranchAsInRootNodeTriangle,Math.max(leftMaxSumAsTriangle,rightMaxSumAsTriangle));
		
	
	
	return new ArrayList<Integer>(Arrays.asList(maxSumAsBranch,runningMaxPathAsSum));
	


	}
	
	
	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;
		
		
		public BinaryTree(int value) {
			this.value=value;
		}
	}
	
	
}