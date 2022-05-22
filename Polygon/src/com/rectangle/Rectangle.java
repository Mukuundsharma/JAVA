package com.rectangle;

import com.polygon.*;

public class Rectangle implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is " + (length * breadth));

	}

	@Override
	public void getCircumference(int length, int breadth) {
		System.out.println("The circumference of the rectangle is " + ((2 * length) + (2 * breadth)));

	}

}
