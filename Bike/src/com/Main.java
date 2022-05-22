package com;

import com.mountainbike.*;
import com.sportsbike.*;

public class Main {
	
	public static void main(String[] args) {
		MountainBike m1 = new MountainBike();
		m1.start();
		m1.accelarate();
	    m1.brake();
	    SportsBike s1 = new SportsBike();
	    s1.start();
		s1.accelarate();
	    s1.brake();
	}
}
