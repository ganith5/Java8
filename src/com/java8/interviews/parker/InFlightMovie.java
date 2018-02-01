package com.java8.interviews.parker;

import java.util.HashSet;
import java.util.Set;

public class InFlightMovie {

	public static void main(String[] args) {
		int[] movieLengths = {25, 20, 25, 30, 50};
		System.out.println("Existing ? " + isSecondMovieAvailable(50, movieLengths));
	}
	
	private static boolean isSecondMovieAvailable(int flightLength, int[] availableMovieLengths) {
		Set<Integer> movieLengthSet = new HashSet<Integer>();
		for(int i=0; i<availableMovieLengths.length; i++) {
			int secondMovieLength = flightLength - availableMovieLengths[i];
			if(movieLengthSet.contains(secondMovieLength)) {
				System.out.println("FML = " + availableMovieLengths[i] + " SML " + secondMovieLength);
				return true;
			}
				
			else
				movieLengthSet.add(availableMovieLengths[i]);
			
		}
		
		return false;
	}

}
