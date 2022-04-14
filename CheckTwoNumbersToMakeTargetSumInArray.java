package com.algoexpert;

import java.util.HashSet;


public class CheckTwoNumbersToMakeTargetSumInArray {

	//HashTable approach
	//Time complexity: O(n)   Space Complexity: O(n)
	public static int[] twoNumberSum(int[] array, int targetSum)  {
		
		HashSet<Integer> setToStore = new HashSet<>();
		
		for(int i=0;i<array.length-1;i++) {
			int currentNumber = array[i];
			int y = targetSum - currentNumber;
			if(setToStore.contains(y)) {
				return new int[] {y, currentNumber};
			}else {
				setToStore.add(currentNumber);
			}
		}
	return new int[0];
	}
}
