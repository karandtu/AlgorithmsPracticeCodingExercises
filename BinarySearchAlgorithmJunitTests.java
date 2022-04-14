package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.BinarySearchAlgorithm;

public class BinarySearchAlgorithmJunitTests {

	@Test
	public void testCase1() {
		new BinarySearchAlgorithm();
		Assertions.assertEquals(BinarySearchAlgorithm.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33), 3);
	}
}
