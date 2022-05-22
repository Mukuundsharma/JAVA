package com.polygon;

import com.rectangle.Rectangle;
import com.square.Square;
import com.triangle.Triangle;

public class PolygonFactory {

	Polygon p1;

	public Polygon createPolygon(String type) {
		if (type == "rectangle") {
			p1 = new Rectangle();
		}
		if (type == "square") {
			p1 = new Square();
		}
		if (type == "triangle") {
			p1 = new Triangle();
		}
		return p1;
	}
}
