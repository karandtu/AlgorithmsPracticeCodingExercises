package com.algoexpert.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algoexpert.Palindrome;

public class PalindromeJUnitTests {

	@Test
	  public void TestCase1() {
	    Assertions.assertTrue(Palindrome.isPalindrome("abcdcba"));
	  }
}
