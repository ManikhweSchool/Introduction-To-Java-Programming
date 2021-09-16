import java.util.Scanner;

public class Exercise_8_1b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		double[][] m = createMatrix(scanner);
		
		// Display sums
		for(int columnIndex = 0; columnIndex < m[0].length;columnIndex++)
			System.out.printf("Sum of elements at column %d is %1.1f\n",
					columnIndex,sumColumn(m,columnIndex));
		
		// Close scanner
		scanner.close();
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		
		if(columnIndex < m[0].length) {
			double sum = 0;
			
			for(int row = 0; row < m.length;row++)
				sum += m[row][columnIndex];
			return sum;
		}
		
		return Double.NaN;
			
	}
	
	public static double[][] createMatrix(Scanner scanner){
		
		System.out.print("Enter number of rows for the matrix : ");
		int numberOfRows = Math.abs(scanner.nextInt());
		
		System.out.print("Enter number of columns for the matrix : ");
		int numberOfColumns = Math.abs(scanner.nextInt());
		
		
		double[][] matrix = new double[numberOfRows][numberOfColumns];
		
		System.out.println("Enter a " + numberOfRows + "-by-" +
		numberOfColumns + " matrix row by row : ");
		
		for(int r = 0; r < numberOfRows;r++)
			for(int c = 0; c < numberOfColumns;c++)
				matrix[r][c] = scanner.nextDouble();
		
		return matrix;
	}

}
