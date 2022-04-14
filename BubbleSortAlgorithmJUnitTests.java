package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.BubbleSortAlgorithm;

public class BubbleSortAlgorithmJUnitTests {

	@Test
	  public void TestCase1() {
	    int[] expected = {2, 3, 5, 5, 6, 8, 9};
	    int[] input = {8, 5, 2, 9, 5, 6, 3};
	    new BubbleSortAlgorithm();
		Assertions.assertEquals(BubbleSortAlgorithm.bubbleSort(input), expected);
  }
}
