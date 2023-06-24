package softblue.designpatterns;

import softblue.designpatterns.gui.Window;
import softblue.designpatterns.shape.Shape;
import softblue.designpatterns.shape.ShapeFactory;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = ShapeFactory.newShape();
		
		w.drawShape(shape);
	}
}
