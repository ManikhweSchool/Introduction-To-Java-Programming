
public class Exercise_9_1 {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		System.out.print("Rectangle1's Width : " + rectangle1.getWidth());
		System.out.print(" Height : " + rectangle1.getHeight());
		System.out.printf("\tArea : %4.2f Perimeter : "
		+ "%4.2f\n", rectangle1.getArea(),rectangle1.getPerimeter());
		
		System.out.print("Rectangle2's Width : " + rectangle2.getWidth());
		System.out.print(" Height : " + rectangle2.getHeight());
		System.out.printf(" Area : %4.2f Perimeter : "
		+ "%4.2f\n", rectangle2.getArea(),rectangle2.getPerimeter());
	}

}
