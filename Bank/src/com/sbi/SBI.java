package com.sbi;

import com.bank.*;

public class SBI extends Bank {
	
	public void getRateOfInterest() {
		System.out.println(" Rate of intrest is 7%");
	}

	@Override
	public void getHomeLoanDetails() {
		System.out.println("Home loans available against mortage");
		
	}

	@Override
	public void getFdDetails() {
		System.out.println("FD Available with special senior citizen benefits");
	}
}
