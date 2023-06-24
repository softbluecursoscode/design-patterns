package softblue.designpatterns.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import softblue.designpatterns.shape.Shape;

public class DrawPanel extends JPanel {
	
	private Shape shape;
	
	public void drawShape(Shape shape) {
		this.shape = shape;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		if (shape != null) {
			shape.draw(g);
		}
	}
}
