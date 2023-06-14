import java.util.ArrayList;
import java.util.List;

public class AllShapes {
	
	private List<Shape> shapes;

	public AllShapes() {
		shapes = new ArrayList<>();
	}
	
	public void addShape(Shape s) throws LimitOfShapesReached{
		if(shapes.size() < 2) {
			shapes.add(s);
		}else {
			throw new LimitOfShapesReached("You cannot add more shapes, the limit is reached");
		}
		
	}
	
	public void removeShape(Shape s) throws ShapeNotInAllShapes{
		shapes.remove(s);
		if(!shapes.remove(s)) {
			throw new ShapeNotInAllShapes("There is no such shape");
		}
	}
	
	public void printAllAreas() {
		for(Shape s : shapes) {
			System.out.println(s.getArea());
		}
	}
	
	
	
}
