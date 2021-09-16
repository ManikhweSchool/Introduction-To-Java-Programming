import java.util.Scanner;

public class Exercise_8_2a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		double[][] matrix = new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row : ");
		
		// Fill matrix
		for(int row = 0; row < matrix.length;row++)
			for(int column = 0; column < matrix.length;column++)
				matrix[row][column] = scanner.nextDouble();
		
		// Display sum
		System.out.printf("Sum of the elements in a "
		+ "major diagonal is %1.1f\n", sumMajorDiagonal(matrix));
		
		// Close scanner
		scanner.close();

	}
	
	public static double sumMajorDiagonal(double[][] m) {
		
		double sum = 0;
		
		for(int i = 0; i < m.length;i++)
			for(int j = 0; j < m[i].length;j++)
				if(i==j)
					sum += m[i][j];
		
		return sum;
	}

}
