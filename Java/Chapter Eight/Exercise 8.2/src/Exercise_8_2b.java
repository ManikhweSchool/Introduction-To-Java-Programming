import java.util.Scanner;

public class Exercise_8_2b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		double[][] matrix = new double[4][4];		
		
		System.out.println("Enter a 4-by-4 matrix row by row : ");
		
		for(int i = 0; i < matrix.length;i++)
			for(int j = 0; j < matrix.length;j++)
				matrix[i][j] = scanner.nextDouble();
		
		System.out.printf("Sum of the elements in "
		+ "a major diagonal is %2.1f", sumMajorDiagonal(matrix));
		
		// Close scanner
		scanner.close();

	}
	
	
	public static double sumMajorDiagonal(double[][] m) {
		
		double result = 0;
		
		for(int rowColumn = 0; rowColumn< m.length;rowColumn++)
			result = result + m[rowColumn][rowColumn];
		
		return result;
	}

}
