package com.score;

public class HighScore {

	static int finalScore;
	static int position;

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			finalScore = (score * 5) + (levelCompleted * bonus);
			finalScore += 400;
			System.out.println("Your Final Score was " + finalScore);
		}
		return finalScore;
	}

//	public static int calculateHighScorePosition(int finalScore) {
//
//		int position = 0 ;
//
//		if (finalScore >= 1000) {
//			position = 1;
//		} else if (finalScore >= 500) {
//			position = 2;
//		} else if (finalScore >= 100) {
//			position = 3;
//		}
//
//		return position;
//	}

	public static void displayHighScorePosition(String playerName) {

		if (finalScore > 1000) {
			position = 1;
		} else if (finalScore > 800) {
			position = 2;
		} else if (finalScore > 500) {
			position = 3;
		} else if (finalScore < 500) {
			position = 4;
		}
		System.out.println(playerName + " managed to get into position " + position + " on the high score table");
	}

}