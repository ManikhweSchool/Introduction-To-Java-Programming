import java.util.Scanner;

public class Exercise_2_19a {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter three points for a triangle : ");
		
		double x1, y1, x2, y2, x3, y3;
		
		x1 = reader.nextDouble();
		y1 = reader.nextDouble();
		
		x2 = reader.nextDouble();
		y2 = reader.nextDouble();
		
		x3 = reader.nextDouble();
		y3 = reader.nextDouble();
		
		// distance AB = Square Root Of((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
		double s1, s2, s3;
		
		// Distance s1 between A(x1;y1) and B(x2:y2) 
		s1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		// Distance s2 between A(x1;y1) and C(x3;y3)
		s2 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		
		// Distance s3 between B(x2;y3) and C(x3;y3)
		s3 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		
		double s = (s1 + s2 + s3)/2;
		double product = s*(s-s1)*(s-s2)*(s-s3);
		
		System.out.printf("The area of the triangle is %2.1f", Math.sqrt(product));
		
		reader.close();
	}

}
