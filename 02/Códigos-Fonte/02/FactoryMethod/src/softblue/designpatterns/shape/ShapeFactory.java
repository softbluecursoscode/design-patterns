package softblue.designpatterns.shape;

import softblue.designpatterns.Props;

public class ShapeFactory {

	public static Shape newShape() {
		
		try {
			String shapeClass = Props.getString("shapeClass");
			Shape shape = (Shape) Class.forName(shapeClass).newInstance();
			
			String[] color = Props.getString("color").split(",");
			shape.defineColor(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2]));
			
			return shape;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Shape newShape(int i) {
		if (i == 1) {
			return new Circle();
		} else if (i == 2) {
			return new Square();
		} else {
			return null;
		}
	}
}
