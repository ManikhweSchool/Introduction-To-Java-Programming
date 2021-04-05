import java.util.Scanner;

public class Exercise_9_13b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter number of rows and columns.
		System.out.print("Enter the number of rows and columns : ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] matrix = new double[rows][columns];
		
		// Prompts the user to enter an array.
		System.out.println("Enter the array : ");
		for(int i = 0; i < matrix.length;i++)
			for(int j = 0; j < matrix[i].length;j++)
				matrix[i][j] = input.nextDouble();
		
		Location location = locateLargest(matrix);
		
		System.out.print("The location of the largest element is "
		+ location.maxValue + " at (" + location.row + 
		',' + location.column + ')');
		
		input.close();

	}
	
	public static Location locateLargest(double[][] matrix) {
		
		Location location = new Location();
		
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				if(matrix[i][j] > location.maxValue) {
					location.row = i;
					location.column = j;
					location.maxValue = matrix[i][j];
				}
			}
		}
		
		return location;
	}

}
