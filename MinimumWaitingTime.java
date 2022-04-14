package com.algoexpert;

public class MinimumWaitingTime {

	public  int minimumWaitingTime(int[] queries) {
		int totalWaitingTime = 0;
		
		for(int i=0;i<queries.length-1;i++) {
			int duration = queries[i];
			int queriesLeft = queries.length - (i+1);
			totalWaitingTime = totalWaitingTime + (queriesLeft * duration);
		}
		return totalWaitingTime;
		
	}
}
