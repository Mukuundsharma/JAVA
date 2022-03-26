package Polymorphism2;
//runtime polymorphism aka dynamic method dispatch
//achieved by Method Overriding.
public class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); 
		Animal myPig = new Pig(); 
		Animal myDog = new Dog(); 
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
