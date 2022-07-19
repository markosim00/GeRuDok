package model.elements;

import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Stroke;

public abstract class DocumentDevice extends DocumentElement{
	
	protected Dimension size;
	protected Point position;
	

	public DocumentDevice(Paint paint, Stroke stroke, Dimension size, Point position) {
		super(paint, stroke);
		
		this.size = size;
		this.position = position;
		
	}


	public Dimension getSize() {
		return size;
	}


	public void setSize(Dimension size) {
		this.size = size;
	}


	public Point getPosition() {
		return position;
	}


	public void setPosition(Point position) {
		this.position = position;
	}
	
	
	
	
	

}
