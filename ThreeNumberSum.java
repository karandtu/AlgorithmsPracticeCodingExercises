package com.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum){
		Arrays.sort(array);
		List<Integer[]> tripletListContainer = new ArrayList<Integer[]>();
		
		/**traversing ith element and checking for each ith element
		whether other two doublets mke sense to be a successfull
		triplet.
		*/
		for(int i=0;i<array.length-2;i++) {
			int left = i+1;
			int right = array.length-1;
			int currentSum =0;
			while(left < right) {
				currentSum = array[i]+array[left]+array[right];
				if(currentSum == targetSum) {
					Integer[] newSubArrayTriplet= new Integer[] {array[i],array[left],array[right]};
					tripletListContainer.add(newSubArrayTriplet);
				}else if(currentSum < targetSum) {
					left++;
				}else {
					right--;
				}
			}
		}
			/**until at some point, left and right pass through each other and move forward
			 * there and then stop the loop.Get out of it.Declare/return that list containing whatevr
			 * number of triplets it formed successfully.
			 */
			return tripletListContainer;
		}
}
