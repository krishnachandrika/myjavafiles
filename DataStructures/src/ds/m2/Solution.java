package ds.m2;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public Team[] sort(Team[] teams) {
		// your code goes here
		System.out.println("hi in sort method");

		Arrays.sort(teams);
		System.out.println("after sort");
		/*
		 * for(int i=0;i<teams.length;i++) { compareTo(teams[i]); }
		 */
		return teams;
	}
}

class Team implements Comparable<Team> {
	String teamName;
	int noOfWins;
	int noOfLosses;
	int noOfDraws;

	Team(String name, int wins, int losses, int draws) {
		teamName = name;
		noOfDraws = draws;
		noOfWins = wins;
		noOfLosses = losses;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", noOfWins=" + noOfWins + ", noOfLosses=" + noOfLosses + ", noOfDraws="
				+ noOfDraws + "]";
	}

	/*
	 * public String toString(){ //retrun all the attributes as a string but
	 * appending with ", " return ""; }
	 */
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		System.out.println("=compare to=");
		if (noOfWins == o.noOfWins) {
			if (noOfLosses == o.noOfLosses) 
			{
				if (noOfDraws == o.noOfDraws) 
				{
					return 0;
				} else if (noOfDraws < o.noOfDraws) 
				{
					return 1;
				} else 
				{
					return -1;
				}
			} else if (noOfLosses > o.noOfLosses) 
			{
				return 1;
			} else {
				return -1;
			}
		} else if (noOfWins < o.noOfWins) 
		{
			return 1;
		} else {
			return -1;
		}

	}
}