package com.algoexpert;

import java.util.Arrays;

public class NonContructibleChange {

	public int nonConstructibleChange(int[] coins) {
		 //Time complexity is O(nlogn) time  | Space Complexity is O(1) .
		Arrays.sort(coins);
		int howManyChangeWeMadeFromCoinAtCurrentPosition = 0;
		
		for(int coin : coins) {
			if(coin > howManyChangeWeMadeFromCoinAtCurrentPosition+1) {
				return howManyChangeWeMadeFromCoinAtCurrentPosition +1;
			}
			howManyChangeWeMadeFromCoinAtCurrentPosition = howManyChangeWeMadeFromCoinAtCurrentPosition + coin;
			}
		
		return howManyChangeWeMadeFromCoinAtCurrentPosition +1;
	}
}
