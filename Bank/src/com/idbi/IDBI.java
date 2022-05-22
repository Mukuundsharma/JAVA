package com.idbi;

import com.bank.*;

public class IDBI extends Bank {
	
	public void getRateOfInterest() {
		System.out.println(" Rate of intrest is 4%");
	}

	@Override
	public void getHomeLoanDetails() {
		System.out.println("Home loans available against mortage and Assets such as Gold");

	}

	@Override
	public void getFdDetails() {
		System.out.println("FDs Available with special senior citizen and businessmen benefits");
	}
}