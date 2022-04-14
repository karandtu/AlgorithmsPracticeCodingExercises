package com.algoexpert;

public class FindSortedSquaredArrayIndex {

	//step1.: we find absolute value from rightPointerIndex compare it with absolute value of leftPointerIndex
	//Step2.: whichever is largest , we square of it and then insert into output array.While insertion, we apply sorting algo.
	//same thing : if inserting largest , apply in right half. is insert smaller , insert into leftHalf. Merge/Heap/Selection/Bubble Sort
	//all takes same approach.  ------->Sub-half the array into 2. Do Sorting and then merge back . It takes nlogn time .
	
	//Time complexity: O(nlogn + n)---->O(nlogn) to optimize. Space Complexity: O(n).
	//Space is O(n) as we need space after space n times until we finish insertion and sorting process completely until
	//we come up with our final sorted merged array with Insertion completed as output merged-sorted Squared array.
	public static int[] sortedSquaredArray(int[] array) {
		int leftPointerIndex =0;
		int rightPointerIndex = array.length-1;
		int[] outputSortedSquaredArray = new int[array.length];
		
		for(int i=array.length-1;i>=0;i--) {
			int largerValue = array[rightPointerIndex];
			int smallerValue= array[leftPointerIndex];
			if(Math.abs(largerValue)>Math.abs(smallerValue)) {
				outputSortedSquaredArray[i]= largerValue * largerValue;
				rightPointerIndex--;
			}else {
				outputSortedSquaredArray[i]= smallerValue * smallerValue;
				leftPointerIndex++;
			}
		}
		return outputSortedSquaredArray;
		
	}
	

}
