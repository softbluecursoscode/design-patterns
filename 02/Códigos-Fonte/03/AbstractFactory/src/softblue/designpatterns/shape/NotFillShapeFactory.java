package softblue.designpatterns.shape;

public class NotFillShapeFactory extends ShapeAbstractFactory {

	@Override
	public Shape newShape(String type) {
		if (type.equals("circle")) {
			return new NotFillCircle();
		} else if (type.equals("square")) {
			return new NotFillSquare();
		}
		
		return null;
	}
}
