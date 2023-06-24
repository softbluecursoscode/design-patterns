package softblue.designpatterns.shape;

public class FillShapeFactory extends ShapeAbstractFactory {

	@Override
	public Shape newShape(String type) {
		if (type.equals("circle")) {
			return new FillCircle();
		} else if (type.equals("square")) {
			return new FillSquare();
		}
		
		return null;
	}
}
