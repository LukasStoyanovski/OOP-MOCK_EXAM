
public class Circle implements Shape{
	
	private double radius;
	private static double PI = 3.14;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPI() {
		return PI;
	}

	@Override
	public double getArea() {
		return PI * (radius * 2);
	}
	
	
	
	
}
