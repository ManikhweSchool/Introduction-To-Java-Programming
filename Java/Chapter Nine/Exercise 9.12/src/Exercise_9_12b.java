import java.util.Scanner;

public class Exercise_9_12b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x1,y1,x2,y2,x3,y3,x4,y4;
		
		
		System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4 : ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		x4 = scanner.nextDouble();
		y4 = scanner.nextDouble();
		
		double gradient1 = (y2-y1)/(x2-x1);
		double gradient2 = (y4-y3)/(x4-x3);
		
		double a = -gradient1;
		double b = 1;
		double c = -gradient2;
		double d = 1;
		double e = -gradient1*x1+y1;
		double f = -gradient2*x3+y3;
		
		LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
		
		if(linearEquation.isSolvable())
			System.out.printf("Intersection Point (x,y) = "
			+"(%1.2f,%1.2f)", linearEquation.getX(),
			linearEquation.getY());
		else
			System.out.println("Lines are parallel");
		
		/*
		IntersectionPoint intersectionPoint = new IntersectionPoint(
		x1,y1,x2,y2,x3,y3,x4,y4);
		
		intersectionPoint.displayIntersectionPoint();
		*/
		
		scanner.close();

	}

}
