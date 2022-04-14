package com.algoexpert;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {

	public int HOME_TEAM_WON=1;
	
	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		
		String currentBestTeam = "";
		HashMap<String, Integer> dataStructureToStoreScores = new HashMap<>();
		
		for(int i =0; i< competitions.size(); i++) {
			ArrayList<String> competition = competitions.get(i);
			int result = results.get(i);
			
			String homeTeam = competition.get(0);
			String awayTeam = competition.get(1);
			String winningTeam = (result == HOME_TEAM_WON)?homeTeam:awayTeam;
		
			updateScores(winningTeam, 3, dataStructureToStoreScores);
			if(dataStructureToStoreScores.get(winningTeam)> dataStructureToStoreScores.get(currentBestTeam)) {
			 currentBestTeam = winningTeam;
			}	
			
		}
		return currentBestTeam;
	}
		
	//This is something we using a dataStructure to store winningTeam as key and its score as value. For e.g. 0 or 3.
	//Then as when we get winningTeam out of each competition, update currentBestTeam as winningTeam
	//when compare scores(currentBestTeam) if less than scores(winningTeam).
	
		public void updateScores(String team, int points, HashMap<String, Integer> scoresMap) {
		 if(!(scoresMap.containsKey(team))) {
			 scoresMap.put(team, 0);
		 }
		 scoresMap.put(team, scoresMap.get(team) + points);
		
	}
}
