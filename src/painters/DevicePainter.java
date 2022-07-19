package painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;

import model.elements.DocumentDevice;
import model.elements.DocumentElement;

public class DevicePainter extends ElementPainter{
	
	protected Shape shape;

	public DevicePainter(DocumentElement element) {
		super(element);
		
	}

	@Override
	public void paint(Graphics2D g, DocumentElement element) {
		
		g.setPaint(Color.BLUE);
		
		g.setStroke(element.getStroke());
		g.draw(getShape());
		g.setPaint(element.getPaint());
		
		g.fill(getShape());
		
		if(element instanceof DocumentDevice) {
			
			g.setPaint(Color.BLACK);
			
			DocumentDevice device = (DocumentDevice) element;
			
			g.drawString(device.getName(), (int) device.getPosition().getX() + 10, (int) device.getPosition().getY() + 10);
			
		}
		
		
	}

	@Override
	public boolean elementAt(DocumentElement element, Point pos) {
		
		return getShape().contains(pos);
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
	

}
