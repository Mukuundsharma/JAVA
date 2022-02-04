
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame() {
		p1= new Player();
		p2= new Player();
		p3= new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		int targetNumber = (int) (Math.random()*10);
		 System.out.println(" I'm thinking a number between 0 and 9");
		 
		 while (true) { 
			 System.out.println(" the number i guessed is"+ targetNumber);
			 p1.Guess();
			 p2.Guess();
			 p3.Guess();
			 
			 guessp1= p1.numbers;
			 System.out.println(" player one guessed "+ guessp1);
			 
			 guessp2= p2.numbers;
			 System.out.println(" player one guessed "+ guessp2);
			 
			 guessp3= p3.numbers;
			 System.out.println(" player one guessed "+ guessp3);
			 
			 if( guessp1==targetNumber) {
				 p1isRight= true;
			 } else if( guessp2==targetNumber) {
				 p2isRight= true;
			 }else if( guessp3==targetNumber) {
				 p3isRight= true;
			 }
		 
		if (p1isRight || p2isRight || p3isRight) {
			System.out.println(" We have a Winner");
			System.out.println("Player one got it right? "+ p1isRight);
			System.out.println("Player two got it right? "+ p2isRight);
			System.out.println("Player three got it right? "+ p3isRight);
			System.out.println(" Game is over");
			break;
		} else {
			System.out.println(" Players will have to try again");
		}
	}
}
}
