package DotComFix;
import java.util.*;
import java.util.ArrayList;

public class DotCom {
	int[] locationCells;
	// int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		ArrayList<String> locationCells;// locationCells = locs;
	}

	public String checkYourself(String userInput) {
		// int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		int index = locationCells.indexof(userInput);//indexof doesnt show in library 
		if (index >= 0) {
			locationCells.remove(index);//
//		for (int cell : locationCells) {
//			if (guess == cell) {
//				result = "hit";
//				numOfHits++;
//
//				break;
//			}
		}
		if (locationCells.isEmpty()) {
			result = "kill";
		} else {
			result = "hit";
		}
		// System.out.println(result);
		return result;
	}
}
