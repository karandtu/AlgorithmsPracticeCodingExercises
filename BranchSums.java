package com.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

		
		public static class BinaryTree {
		    int value;
		    protected BinaryTree left;
		    public BinaryTree right;

		    protected BinaryTree(int value) {
		      this.value = value;
		      this.left = null;
		      this.right = null;
		    }
		  }
		
		public static List<Integer> branchSums(BinaryTree root) {
			int runningSum =0;
			List<Integer> sums = new ArrayList<Integer>();
			calculateTotalBranchSum(root, runningSum, sums);
			
			return sums;
	}

		private static void calculateTotalBranchSum(BinaryTree node, int runningSum, List<Integer> sums) {
			if(node==null)
				return;
			
			int newRunningSum = runningSum + node.value;
			if(node.left==null && node.right==null) {
				sums.add(newRunningSum);
			}
			calculateTotalBranchSum(node.left, newRunningSum, sums);
			calculateTotalBranchSum(node.right, newRunningSum, sums);
		}
}
