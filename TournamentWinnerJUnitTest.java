package com.algoexpert.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.algoexpert.TournamentWinner;



public class TournamentWinnerJUnitTest {

	@Test
	public void testCase1() {
		ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
	    ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML","C#"));
	    ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
	    ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));

		competitions.add(competition1);
		competitions.add(competition2);
		competitions.add(competition3);
		
		ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0,0,1));
		String expected ="Python";
		String actual  = new TournamentWinner().tournamentWinner(competitions, results);

	    //Assert.assertTrue(expected == actual);
	    assertEquals(expected, actual);
	}
}
