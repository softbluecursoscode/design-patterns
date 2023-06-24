package softblue.designpatterns.shape;

import java.awt.Graphics;

public class Circle implements Shape {

	@Override
	public void draw(Graphics g) {
		g.drawOval(0, 0, 50, 50);
	}
}
