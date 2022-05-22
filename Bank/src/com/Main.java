package com;

import com.bank.*;
import com.idbi.*;
import com.sbi.*;

public class Main {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		b.getFdDetails();
		b.getHomeLoanDetails();
		b.getRateOfInterest();
		
		b = new IDBI();
		b.getFdDetails();
		b.getHomeLoanDetails();
		b.getRateOfInterest();
	}
}