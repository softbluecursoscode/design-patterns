package softblue.designpatterns.shape;

import java.awt.Graphics;

public class NotFillSquare extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(0, 0, 100, 100);
	}
}
