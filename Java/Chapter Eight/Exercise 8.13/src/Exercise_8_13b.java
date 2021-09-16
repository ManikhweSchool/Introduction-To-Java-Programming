import java.util.Scanner;

public class Exercise_8_13b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the number of rows and columns of the array: ");
		byte rows = scanner.nextByte();
		byte columns = scanner.nextByte();
				
		if(rows <1 || columns<1) {
			System.err.print("Error : Invalid Rows Or Columns.");
			System.exit(0);
		}
				
		double[][] matrix = new double[rows][columns];
				
		System.out.println("Enter the array : ");
		for(byte i = 0; i < rows;i++)
			for(byte j = 0; j < columns;j++)
				matrix[i][j] = scanner.nextDouble();
				
		int[] location = locateLargest(matrix);	
		
		System.out.print("The location of the largest element is at ("
		+ location[0] + ',' + location[1] + ')');
				
		// Close scanner
		scanner.close();

	}
	
	public static int[] locateLargest(double[][] a) {
		
		int[] location = new int[2];
		
		double max = a[0][0];
		
		for(int row = a.length-1;row>=0;row--) {
			for(int column = a[a.length-1].length-1;column>=0;column--) {
				if(max < a[row][column]) {
					location[0] = row;
					location[1] = column;
					max = a[row][column];
				}
			}
		}
		
		return location;
	}

}
