package SimpleDotComGame;
//test code didn't run 
//public class SimpleDotComTestDrive {
//	 public static void main (String[] args) {
//	 SimpleDotCom dot = new SimpleDotCom();
//	 int[] locations = {2,3,4};
//	 dot.setLocationCells(locations);
//	 
//	 String userGuess = "2";
//	 String result = dot.checkYourself(userGuess);
//	 String testResult = "failed";
//	 if (result.equals("hit") ) {
//	 testResult = "passed";
//	 }
//	 System.out.println(testResult); 
//	 }
//}

//Test code 2
//public class SimpleDotComTestDrive {
//	public static void main(String[] args) {
//		SimpleDotCom dot = new SimpleDotCom();
//		int randomNum = (int) (Math.random() * 5);
//		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
//		dot.setLocationCells(locations);
//		boolean isDead = false;
//
//		while (isDead = false) {
//			String userGuess = "0";
//			Scanner in = new Scanner(System.in);// Added by mukund
//			userGuess = in.nextLine();
//			// String userGuess = "2";
//			String result = dot.checkYourself(userGuess);
//		}
//	}
//}