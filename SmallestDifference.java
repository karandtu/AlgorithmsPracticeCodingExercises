package com.algoexpert;

import java.util.Arrays;

public class SmallestDifference {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		//sorting the two Arrays
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		int index1=0;
		int index2=0;
		int[] smallestPair = new int[2];
		int smallestDifference = 0;
		int currentDifference =0;
		while(index1<arrayOne.length && index2<arrayTwo.length) {
			int firstNumber = arrayOne[index1];
			int secondNumber = arrayTwo[index2];
			
			if(firstNumber<secondNumber) {
				currentDifference = Math.abs(firstNumber-secondNumber);
				index1++;
			}else if (firstNumber>secondNumber) {
				currentDifference = Math.abs(firstNumber-secondNumber);
				index2++;
			}else {
				return new int[] {firstNumber,secondNumber};
			}
			if(smallestDifference > currentDifference) {
				smallestDifference=currentDifference;
				smallestPair = new int[] {firstNumber,secondNumber};
			}
				
			
		}
		return smallestPair;
		
	}
}
