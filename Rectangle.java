
public class Rectangle implements Shape{
	
	private int width;
	private int heigth;

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.heigth = height;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return heigth;
	}
	
	public void setHeight(int height) {
		this.heigth = height;
	}
	
	@Override
	public double getArea() {
		return heigth * width;
	}

}
