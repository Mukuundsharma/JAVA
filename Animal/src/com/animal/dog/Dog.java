package com.animal.dog;
import com.animal.*;

public class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("the dog says woof");
		
	}
	public void animalType() {
		System.out.println("Four legs");
	}
}
