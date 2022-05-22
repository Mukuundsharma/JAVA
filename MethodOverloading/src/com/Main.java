package com;

import com.calculator.calculator;

public class Main {
	public static void main(String args[]) {
		calculator calci = new calculator();
		System.out.println("Addition of two operands is " + calci.add(10, 20));
		System.out.println("Addition of three operands is " + calci.add(10, 20, 30));
		System.out.println("subtraction of three operands is " + calci.sub(10, 20, 30));
	}
}
