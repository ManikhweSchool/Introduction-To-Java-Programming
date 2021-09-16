import java.util.Scanner;

public class Exercise_8_15a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[][] matrix = new double[5][2];
		System.out.print("Enter five points: ");
		
		for(int i = 0; i < matrix.length;i++)
			for(int j = 0; j < matrix[0].length;j++)
				matrix[i][j] = scanner.nextDouble();
		
		if(sameLine(matrix))
			System.out.println("The five points are in the same line.");
		else
			System.out.println("The five points are not in the same line.");
		
		scanner.close();

	}
	
	public static boolean sameLine(double[][] points) {
		
		if(points.length<2) {
			System.err.println("Error : There must be atleast two points.");
			System.exit(0);
		}
		
		double x1 = points[0][0];
		double y1 = points[0][1];
		
		double x2 = points[1][0];
		double y2 = points[1][1];
		
		double gradient = (y2-y1)/(x2-x1);
		
		for(int secondPoint = 2; secondPoint < points.length;secondPoint++) {
			x2 = points[secondPoint][0];
			y2 = points[secondPoint][1];
			
			if(gradient != ((y2-y1)/(x2-x1))) {
				
				return false;
			}
		}
		
		return true;
	}

}
