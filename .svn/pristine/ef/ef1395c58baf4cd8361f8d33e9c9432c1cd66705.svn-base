package painters;

import java.awt.geom.GeneralPath;

import model.elements.DocumentElement;
import model.elements.RectangleElement;

public class RectanglePainter extends DevicePainter{

	public RectanglePainter(DocumentElement element) {
		super(element);
		
		RectangleElement rectangle = (RectangleElement) element;
		
		shape = new GeneralPath();
		
		((GeneralPath)shape).moveTo(rectangle.getPosition().x, rectangle.getPosition().y);
		
		((GeneralPath)shape).lineTo(rectangle.getPosition().x + rectangle.getSize().width, rectangle.getPosition().y);
		
		((GeneralPath)shape).lineTo(rectangle.getPosition().x + rectangle.getSize().width, rectangle.getPosition().y + rectangle.getSize().width);
		
		((GeneralPath)shape).lineTo(rectangle.getPosition().x, rectangle.getPosition().y + rectangle.getSize().width);
		
		((GeneralPath)shape).closePath();
		
		
	}

}
