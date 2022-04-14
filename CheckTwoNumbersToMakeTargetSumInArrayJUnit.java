package com.algoexpert.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.algoexpert.CheckTwoNumbersToMakeTargetSumInArray;


public class CheckTwoNumbersToMakeTargetSumInArrayJUnit {

	//Tests to check whether inputs suffice the conditions on the method.
	
	@Mock
	CheckTwoNumbersToMakeTargetSumInArray classToValidate;
	
	@BeforeEach
	public void classToValidate() {
		classToValidate = new CheckTwoNumbersToMakeTargetSumInArray();
			
	}
		
		@Test
		public void checkTwoNumbersToMakeTargetSumTestable() {
			int[] array = {3,5,-4,8,11,1,-1,6};
			HashSet<Integer> storage = new HashSet<>();
			int i=0, targetSum = 10;
			int currentNumberFromArray = array[i];
			int potentialMatch = targetSum - currentNumberFromArray;
			boolean result = false;
			assertEquals(10, CheckTwoNumbersToMakeTargetSumInArray.twoNumberSum(array, targetSum));
		}
		
}
