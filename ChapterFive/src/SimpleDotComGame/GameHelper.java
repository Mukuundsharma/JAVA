package SimpleDotComGame;

import java.io.*;

public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}
//prepcode class
/*
 * public class checkYourself { public String checkYourself(String stringGuess)
 * { int guess= Integer.parseInt(stringGuess); //converting a string to an int
 * String result ="Miss";
 * 
 * for(int cell: locationCells) {//colon stands for "IN" if (guess==cell) {
 * result = "Hit"; numOfhits++;//increment break;//get out of loop }
 * 
 * if(numOfHits == locationCells.lenght) { result= "kill";
 * 
 * } System.out.println(result); return result; } } }
 */
//test code didn't run
