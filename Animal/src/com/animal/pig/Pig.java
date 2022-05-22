package com.animal.pig;
import com.animal.*;

public class Pig implements Animal {
	@Override
	public void animalSound() {
		System.out.println("the pig says oink");
		
	}
	@Override
	public void animalType() {
		System.out.println("Pig Four legs");
		
	}

}
