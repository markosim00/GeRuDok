package painters;

import java.awt.Graphics2D;
import java.awt.Point;


import model.elements.DocumentElement;

public abstract class ElementPainter {
	
	public ElementPainter(DocumentElement element) { 
		
	}
	
	public abstract void paint(Graphics2D g, DocumentElement element);
	
	public abstract boolean elementAt(DocumentElement element,Point pos);
	
}
