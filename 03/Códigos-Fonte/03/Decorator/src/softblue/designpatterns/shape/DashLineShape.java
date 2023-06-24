package softblue.designpatterns.shape;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DashLineShape extends ShapeDecorator {

	public DashLineShape(Shape shape) {
		super(shape);
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		BasicStroke stroke = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{ 9 }, 0);
		g2d.setStroke(stroke);
		
		super.draw(g2d);
		
		g2d.dispose();
	}
}
