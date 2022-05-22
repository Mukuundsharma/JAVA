package com.sportsbike;

import com.motorbike.*;

public class SportsBike extends MotorBike {

	public void start() {
		System.out.println("SportsBike starts");
	}

	public void accelarate() {
		System.out.println("SportsBike accelarates very fast");
	}

	public void brake() {
		System.out.println("SportsBike Brakes to stop");
	}
}
