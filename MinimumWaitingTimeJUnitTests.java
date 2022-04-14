package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.MinimumWaitingTime;

public class MinimumWaitingTimeJUnitTests {

	@Test
	  public void TestCase1() {
	    int[] queries = new int[] {3, 2, 1, 2, 6};
	    int expected = 22;
	    int actual = new MinimumWaitingTime().minimumWaitingTime(queries);
	    Assertions.assertTrue(actual == expected);
   }
}