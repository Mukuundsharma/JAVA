package com.triangle;

import com.polygon.*;

public class Triangle implements Polygon {
	private int side1;
	private int side2;
	private int side3;

	/**
	 * @return the side1
	 */
	private int getSide1() {
		return side1;
	}

	/**
	 * @param side1 the side1 to set
	 */
	private void setSide1(int side1) {
		this.side1 = side1;
	}

	/**
	 * @return the side2
	 */
	private int getSide2() {
		return side2;
	}

	/**
	 * @param side2 the side2 to set
	 */
	private void setSide2(int side2) {
		this.side2 = side2;
	}

	/**
	 * @return the side3
	 */
	private int getSide3() {
		return side3;
	}

	/**
	 * @param side3 the side3 to set
	 */
	private void setSide3(int side3) {
		this.side3 = side3;
	}

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("The area of the Triangle is " + ((length * breadth) * 0.5));

	}

//	public void getCircumference(int side1, int side2, int side3) {
//		System.out.println("The area of the rectangle is " + ((side1+side2+side3));
//
//	}

	@Override
	public void getCircumference(int length, int breadth) {
		// TODO Auto-generated method stub
		this.side1 = length;
		this.side2 = breadth;
		setSide3(side3);
		System.out.println("The circumference of the triangle is "+ (side1+side2+side3));
	}
}
