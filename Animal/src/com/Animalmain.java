package com;


import com.animal.*;
import com.animal.dog.Dog;
import com.animal.pig.Pig;

public class Animalmain {

	public static void main(String[] args) {
		Animal an= new Dog();
		an.animalSound();
		an.animalType();
		an= new Pig();
		an.animalSound();
		an.animalType();
	}

}
