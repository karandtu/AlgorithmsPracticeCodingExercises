package com.algoexpert;



public class BubbleSortAlgorithm {

	 public static int[] bubbleSort(int[] array) {
		 
		 if(array.length ==0) {
			 return new int[]{};
		 }
		 
		 boolean isSorted = false;
		 while(!isSorted) {
			 isSorted = true;
			 for(int i =0; i<array.length-1; i++) {
				 if(array[i]>array[i+1]) {
					swap(i,i+1,array); 
					isSorted = false;
				 }
			 }
		 }
		 return array;
	 }

	private static void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i]= temp;
		
	}
	 
	
}
