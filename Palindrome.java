package com.algoexpert;

public class Palindrome {

	
	public static boolean isPalindrome(String str) {
		
		String reversedString = "";
		
		for(int i =str.length()-1 ; i>=0; i++) {
			reversedString = reversedString + str.charAt(i);
		}
		return str.equals(reversedString);
	}
}
