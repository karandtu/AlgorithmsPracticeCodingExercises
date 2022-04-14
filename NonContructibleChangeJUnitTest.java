package com.algoexpert.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.algoexpert.NonContructibleChange;

public class NonContructibleChangeJUnitTest {

	@Test
	public void testCase() {
		
		int[] coins = new int[] {5, 7, 1, 1, 2, 3, 22};
		int expected = 20;
		
		int actual = new NonContructibleChange().nonConstructibleChange(coins);
	    assertEquals(expected, actual);

		
	}
}
