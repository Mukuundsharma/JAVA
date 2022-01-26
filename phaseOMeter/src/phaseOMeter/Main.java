package phaseOMeter;
//page 16 chapter 1
public class Main {

	public static void main(String[] args) {
		String[] firstWord= {"charlie","jack","Mukund","hari","nick"};
		String[] secondWord= {"ravi","vincent","amit","jai","rishabh"};
		String[] thirdWord= {"sharma","chaplin","adolf","lopez","singh"};
		
		int oneLength=firstWord.length;
		int twoLength=secondWord.length;
		int thirdLength=thirdWord.length;
		
		int rand1=(int) (Math.random()*oneLength);
		int rand2=(int) (Math.random()*twoLength);
		int rand3=(int)  (Math.random()*thirdLength);
		
		String phrase = firstWord[rand1]+" "+secondWord[rand2]+" "+ thirdWord[rand3];
		
		System.out.println("The whole name is "+ phrase);
		}

}
