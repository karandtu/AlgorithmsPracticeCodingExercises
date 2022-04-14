package com.algoexpert;



/**  TIME COMPLEXITY: Average case O(log N) : Space: O(log d)
	* TIME COMPLEXITY: Worst case O(N) : Space: O(N) or O(d) where d is just depth variable.
 * 
 * @author KARAN
 *
 */
public class FindClosestValueInBinarySearchTreeIterativeApproach {

	public static int findClosestValueInBinarySearchTree(BST tree, int target) {
		return findClosestPathValueInBinarySearchTree(tree, target, tree.value);
	}
		
		public static int findClosestPathValueInBinarySearchTree(BST tree, int target, int closest) {
			BST currentNode = tree;
			
			  while(currentNode!= null) {
				  if (Math.abs(closest - target) > Math.abs(currentNode.value - target)) {
					  //please update closest as currentNode's value
						closest = currentNode.value;
					}
				  
				  //Furthermore do also check please if target is less than this currentNode.value or tree.value in general
				  //if yes, please dig your search in left-wards or else right-wards.
				if(target < currentNode.value) {
					currentNode = currentNode.left;
				}else if(target > currentNode.value) {
					currentNode = currentNode.right;
				}else {
					//if target matches ditto right there at node , stop it and break out of loop.
					//Now you've got the final closest.
					break;
				}
			
		}
			//Now you've got the final closest.
			  return closest;
		}
		
		
		
		
		
		public static class BST {
		    public int value;
		    public BST left;
		    public BST right;

		    public BST(int value) {
		      this.value = value;
		    }
		  }
	
}
