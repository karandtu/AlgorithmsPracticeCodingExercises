package com.algoexpert;

public class FindClosestValueInBinarySearchTreeResursiveApproach {

	
	/**
	 * @author KARAN
	 * 
    * Recursive approach so each time at each iteration, we put our Target.
	* Compare absolute differences between closest<>target and tree.value<>target.
	* Then we update closest accordingly. Also at each iteration, if target < or > tree.value, we decide
	* whether next depth is towards left or right and whichever the choice, we eliminate other half.
	* Hence length of array was n .Then after iteration 1 becomes n/2. After iteration becomes n/4...until
	* after iteration k becomes length of array will be 1.
	* Hence time complexity will be O(log N) Space will also need to have left spaces or right space to store-consider the new
	* halved-reduced recursive array.So space also becomes O(log d) where d ---->depth of tree towards bottom
	
	* TIME COMPLEXITY: Average case O(log N) : Space: O(log d)
	* TIME COMPLEXITY: Worst case O(N) : Space: O(N) or O(d) where d is just depth variable.
	
	* To look for better approach or optimize the space complexity to O(1), we could think of ITERATIVELY solving the 
	* algorithm instead of recursively solving it into halves until you meet array.length =1 at bottom.
	 * @param tree
	 * @param target
	 * @return
	 */
	public static int findClosestValueInBinarySearchTree(BST tree, int target) {
		return findClosestPathValueInBinarySearchTree(tree, target, tree.value);
	}
		
		public static int findClosestPathValueInBinarySearchTree(BST tree, int target, int closest) {
			if (Math.abs(closest - target) > Math.abs(tree.value - target)) {
				closest = tree.value;
			}
			
				if(target < tree.value) {
					return findClosestPathValueInBinarySearchTree(tree.left, target, closest);
				}else if(target > tree.value) {
					return findClosestPathValueInBinarySearchTree(tree.right, target, closest);	
				}else {
					return closest;
				}
			
		}
		
		
		
		
		
		static class BST {
		    public int value;
		    public BST left;
		    public BST right;

		    public BST(int value) {
		      this.value = value;
		    }
		  }
	
}
