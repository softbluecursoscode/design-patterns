package softblue.designpatterns;

import softblue.designpatterns.gui.Window;
import softblue.designpatterns.shape.Shape;
import softblue.designpatterns.shape.ShapeAbstractFactory;
import softblue.designpatterns.shape.ShapeFactoryProducer;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
		Shape shape = factory.newShape("circle");
		
		w.drawShape(shape);
	}
}
