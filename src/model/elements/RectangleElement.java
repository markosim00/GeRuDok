package model.elements;

import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Stroke;

import painters.RectanglePainter;

public class RectangleElement extends DocumentDevice{

	public RectangleElement(Paint paint, Stroke stroke, Dimension size, Point position) {
		super(paint, stroke, size, position);
		elementPainter = new RectanglePainter(this);
	}
	
	
	

}
