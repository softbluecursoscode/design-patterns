package softblue.designpatterns;

import java.awt.Color;

import softblue.designpatterns.gui.Window;
import softblue.designpatterns.shape.ColorShape;
import softblue.designpatterns.shape.DashLineShape;
import softblue.designpatterns.shape.Shape;
import softblue.designpatterns.shape.Square;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = new DashLineShape(new ColorShape(new Square(), Color.YELLOW));
		
		w.drawShape(shape);
	}
}
