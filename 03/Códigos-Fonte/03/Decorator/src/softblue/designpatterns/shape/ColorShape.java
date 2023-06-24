package softblue.designpatterns.shape;

import java.awt.Color;
import java.awt.Graphics;

public class ColorShape extends ShapeDecorator {
	
	private Color color;

	public ColorShape(Shape shape, Color color) {
		super(shape);
		this.color = color;
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics gCopy = g.create();
		
		gCopy.setColor(color);
		super.draw(gCopy);
		
		gCopy.dispose();
	}
}
