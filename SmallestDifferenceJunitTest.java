package com.algoexpert.tests;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.SmallestDifference;

public class SmallestDifferenceJunitTest {

	@Test
	  public void TestCase1() {
	    int[] expected = {28, 26};
	    Assertions.assertTrue(
	        Arrays.equals(
	        		SmallestDifference.smallestDifference(
	                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
	            expected));
}
}
