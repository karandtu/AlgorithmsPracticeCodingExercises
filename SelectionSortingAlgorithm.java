package com.algoexpert;

public class SelectionSortingAlgorithm {

	public static int[] selectionSort(int[] array) {
		if(array.length==0) {
			return new int[] {};
			
		}
		
		for(int i=0; i < array.length-1; i++) {
			int min = i;
			//this inner loop to check n comparison with always first element of a given
			//particular unsorted array and then check if any number comes out to be more minimum 
			//than the very first element of unsorted array as when i keep incrementing n times.
			//For comparison, if other elements than first element of given unsorted array is not
			//minimum, j keep on incrementing n times
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			//if your jth number(number which is in charge of doing comparison with first element
			// comes to be outside of last element, get out of the loop.
			//Here we just saying that along side by side, once you find minimum element in any unsorted
			//array with always its first element, do also make the swapping.
			
			if(min!=i) {
				swap(array[i],array[min],array);
			}
		}
		return array;
	}

	  private static void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j]= array[i];
		array[i]=temp;
		
	}
	
	  
	
}
