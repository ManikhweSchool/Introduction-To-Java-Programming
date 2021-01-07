
public class Rectangle {

	// Data Fields
	private double width;
	private double height;
	
	// Constructors
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	// Methods
	public double getArea() {
		
		return width*height;
	}
	
	public double getPerimeter() {
		
		return 2*(width+height);
	}
	
	public double getWidth() { return width;}
	public double getHeight() { return height;}
}
