package com;

import java.util.ArrayList;
import java.util.List;

import com.polygon.Polygon;
import com.polygon.PolygonFactory;

public class Main {

	static PolygonFactory p1 = new PolygonFactory();

	public static void main(String[] args) {

		Polygon polygon = p1.createPolygon("rectangle");
		polygon.getArea(5, 6);
		polygon.getCircumference(2, 10);

		polygon = p1.createPolygon("square");
		polygon.getArea(2, 2);
		polygon.getCircumference(2, 2);

		polygon = p1.createPolygon("triangle");
		polygon.getArea(12, 30);

		polygon = p1.createPolygon("triangle");
		polygon.getCircumference(12, 34);
		List<String> list = new ArrayList<String>();

	}
}