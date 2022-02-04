import java.sql.Array;
import java.util.Random;

public class Player {
	int numbers= 0;
public void Guess() {
	numbers = (int)(Math.random()*10);
	System.out.println(" i'm guessing "+ numbers);
}
}
