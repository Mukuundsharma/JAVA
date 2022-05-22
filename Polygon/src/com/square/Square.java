package com.square;

import com.polygon.*;

public class Square implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		length = breadth;
		System.out.println("The area of the square is " + (length * breadth));
	}

	@Override
	public void getCircumference(int length, int breadth) {
		length = breadth;
		System.out.println("The circumference of the square is " + ((2 * length) + (2 * breadth)));

	}

}
