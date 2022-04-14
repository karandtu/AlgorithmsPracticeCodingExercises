package com.algoexpert.tests;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.SubArraySort;

public class SubArraySortJUnitTest {

	  @Test
	  public void TestCase1() {
	    int[] expected = {7,8};
	    Assertions.assertTrue(
	        Arrays.equals(
	        		SubArraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
	            expected));
	  }
	
}
