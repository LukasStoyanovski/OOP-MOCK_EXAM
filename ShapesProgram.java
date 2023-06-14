
public class ShapesProgram {

	public static void main(String[] args) throws ShapeNotInAllShapes, LimitOfShapesReached {
		AllShapes allshapes = new AllShapes();
		Rectangle rectangle1 = new Rectangle(10, 5);
		Rectangle rectangle2 = new Rectangle(4, 20);
		Circle circle1 = new Circle(20);
		
		allshapes.addShape(rectangle1);
		allshapes.addShape(rectangle2);
		allshapes.removeShape(circle1);
		
		allshapes.printAllAreas();

	}

}
