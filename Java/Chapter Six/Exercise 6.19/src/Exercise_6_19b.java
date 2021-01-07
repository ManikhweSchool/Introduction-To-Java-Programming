import java.util.Scanner;

public class Exercise_6_19b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		double side1,side2,side3;
		
		System.out.print("Enter side1 : ");
		side1 = input.nextDouble();
		System.out.print("Enter side2 : ");
		side2 = input.nextDouble();
		System.out.print("Enter side3 : ");
		side3 = input.nextDouble();
		
		double area = area(side1,side2,side3);
		
		if(area != -1)
			System.out.printf("The area is %3.2f", area);
		else
			System.out.print("Invalid input.");
		
		// Close scanner
		input.close();

	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		 
		return (side1>0 && side2>0 && side3>0)
		&& side1+side2>side3 && side1+side3>side2
		&& side2+side3>side1;
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double area;
		
		if(!isValid(side1,side2,side3))
			area = -1;
		else {
			double s = (side1+side2+side3)/2;
			area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		}
			
		
		return area;
	}

}
