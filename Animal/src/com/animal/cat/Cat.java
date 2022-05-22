package com.animal.cat;
import com.animal.*;

public class Cat implements Animal {

	@Override
	public void animalSound() {
		System.out.println("the cat says meow");
	}

	@Override
	public void animalType() {
		System.out.println("Four legs");
		
	}

}
