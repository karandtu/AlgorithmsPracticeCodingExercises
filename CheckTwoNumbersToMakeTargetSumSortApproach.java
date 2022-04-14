package com.algoexpert;

import java.util.Arrays;

public class CheckTwoNumbersToMakeTargetSumSortApproach {

	public static int[] twoNumberSum(int[] array, int targetSum)  {
 
		
		//Time complexity: O(nlogn) Space Complexity: O(1)
		Arrays.sort(array);
		int leftPointer = 0;
		int rightPointer = array.length-1;
		while(leftPointer < rightPointer) {
			
			if(array[leftPointer] + array[rightPointer] == targetSum) {
				return new int[]{array[rightPointer],array[leftPointer]};
			}else if (array[leftPointer] + array[rightPointer] < targetSum) {
				leftPointer++;
			}else if(array[leftPointer] + array[rightPointer] > targetSum) {
				rightPointer--;
			}
		}
		
		return new int[0];
	}
}
