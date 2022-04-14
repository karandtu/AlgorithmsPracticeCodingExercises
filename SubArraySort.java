package com.algoexpert;

public class SubArraySort {

	  public static int[] subarraySort(int[] array) {
		  
		  int minimumValueOutOfOrder = Integer.MAX_VALUE;
		  int maximumValueOutOfOrder = Integer.MIN_VALUE;
		  
		  for(int i=0;i<array.length;i++) {
			  int num = array[i];
			  if (isOutOfOrder(i, num, array)){
				  //update the minimum value out of order otherwise keep infinity as minValueOutOfOrder
				  minimumValueOutOfOrder = Math.min(minimumValueOutOfOrder, num);
				  //update the maximum value out of order otherwise keep negative(infinity) as maxValueOutOfOrder
				  maximumValueOutOfOrder = Math.max(maximumValueOutOfOrder, num);
			  }
		  }
		  if (minimumValueOutOfOrder ==Integer.MAX_VALUE) {
			  return new int[] {-1, -1};
		  }
		  
		  //Now consider subArraySorting
		  int leftPointerAtLeftSubArrayStartAscending = 0;
		  while(minimumValueOutOfOrder >= array[leftPointerAtLeftSubArrayStartAscending]) {
			  leftPointerAtLeftSubArrayStartAscending++;
		  }
		  int rightPointerAtRightSubArrayEndDescending = array.length-1;
		  while(maximumValueOutOfOrder <= rightPointerAtRightSubArrayEndDescending) {
			  rightPointerAtRightSubArrayEndDescending--;
		  }
		  return new int[] {leftPointerAtLeftSubArrayStartAscending,rightPointerAtRightSubArrayEndDescending};
	  }

	private static boolean isOutOfOrder(int i, int num, int[] array) {
		if (i == 0) {
			return num > array[i+1];
		}
		if(i == array.length-1) {
			return num < array[i-1];
		}
		return num > array[i+1] || num < array[i-1];
	}
}
