package softblue.designpatterns.shape;

import java.awt.Graphics;

public class Square extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(0, 0, 100, 100);
	}
}
