import java.util.Scanner;

public class Exercise_8_1a {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-4 matrix row by row : ");
		
		double[][] matrix = new double[3][4];
		
		// Fill matrix
		for(int row = 0; row < 3;row++)
			for(int column = 0; column < 4;column++)
				matrix[row][column] = scanner.nextDouble();
		
		// Display Result
		for(int columnIndex = 0; columnIndex < 4;columnIndex++)
			System.out.printf("Sum of the elements at column %d is %1.1f\n",
			columnIndex, sumColumn(matrix, columnIndex));
		
		// close scanner
		scanner.close();
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sum = 0;
		
		if(columnIndex < 4 && columnIndex>-1) {
			for(byte row = 0; row < m[0].length-1;row++)
				sum += m[row][columnIndex];
			return sum;
		}
		return Double.NaN;
		
	}

}
