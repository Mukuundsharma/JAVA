package com.mountainbike;

import com.motorbike.MotorBike;

public class MountainBike extends MotorBike {

	public void start() {
		System.out.println("MountainBike starts");
	}

	public void accelarate() {
		System.out.println("MountainBike accelarates wiht lots of sound");
	}

	public void brake() {
		System.out.println("MountainBike Brakes & stops");
	}
}
