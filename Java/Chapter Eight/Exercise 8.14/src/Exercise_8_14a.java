import java.util.Scanner;

// Also Test A Matrix Of Zeros Only And Ones Only.
public class Exercise_8_14a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size for the matrix : ");
		int size = scanner.nextInt();
		
		if(size<=0) {
			System.err.print("Error : Invalid Matrix Dimension");
			System.exit(0);
		}
		
		boolean[][] matrix = new boolean[size][size];
		modifyMatrix(matrix);
		display(matrix);
		
		boolean[] zerosRows = findZeroRowsOrColumns(matrix, true, true);
		boolean[] onesRows = findZeroRowsOrColumns(matrix, true, false);
		boolean containsOnRows = false;
		
		for(int i = 0; i < zerosRows.length;i++) {
			if(zerosRows[i]) {
				System.out.println("All 0s on row " + i);
				if(!containsOnRows)
					containsOnRows = true;
			}
			if(onesRows[i]) {
				System.out.println("All 1s on row " + i);
				if(!containsOnRows)
					containsOnRows = true;
			}
		}
		
		if(!containsOnRows)
			System.out.println("No same numbers on a rows");
		
		boolean[] zerosColumns = findZeroRowsOrColumns(matrix, false, true);
		boolean[] onesColumns = findZeroRowsOrColumns(matrix, false, false);
		boolean containsOnColumns = false;
		
		for(int i = 0; i < zerosRows.length;i++) {
			if(zerosColumns[i]) {
				System.out.println("All 0s on column " + i);
				if(!containsOnColumns)
					containsOnColumns = true;
			}
			if(onesColumns[i]) {
				System.out.println("All 1s on column " + i);
				if(!containsOnColumns)
					containsOnColumns = true;
			}
		}
		
		if(!containsOnColumns)
			System.out.println("No same numbers on a columns");
		
		int[][][] majorDiagonalZeros = findMajorDiagonal(matrix, true);
		int[][][] majorDiagonalOnes = findMajorDiagonal(matrix, false);
		boolean containsOnMajorDiagonal = false;
		
		
		for(int rowColumn1 = 0; rowColumn1 < majorDiagonalZeros.length && 
		rowColumn1 < majorDiagonalOnes.length;rowColumn1++) {
			boolean containsZerosOnMajorDiagonal = false;
			// Check 0s only
			if(majorDiagonalZeros[rowColumn1][1][0]==1) {
				int[] positions = majorDiagonalZeros[rowColumn1][0];
				System.out.println("All 0s on major diagonal from (" +
				positions[0] + ',' + positions[1] + ") to (" + 
				positions[2] + ',' + positions[3] + ')');
				if(!containsOnMajorDiagonal) {
					containsOnMajorDiagonal = true;
				}
				containsZerosOnMajorDiagonal = true;
			}
			// Check 1s only
			if(!containsZerosOnMajorDiagonal && majorDiagonalOnes[rowColumn1][1][0]==1) {
				int[] positions = majorDiagonalZeros[rowColumn1][0];
				System.out.println("All 1s on major diagonal from (" +
				positions[0] + ',' + positions[1] + ") to (" + 
				positions[2] + ',' + positions[3] + ')');
				if(!containsOnMajorDiagonal)
					containsOnMajorDiagonal = true;
			}
		}
		
		if(!containsOnMajorDiagonal)
			System.out.println("No same numbers on the major diagonal ");
		
		int[][][] subDiagonalZeros = findSubDiagonal(matrix, true);
		int[][][] subDiagonalOnes = findSubDiagonal(matrix, false);
		boolean containsOnSubDiagonal = false;
		
		
		for(int rowColumn1 = 0; rowColumn1 < subDiagonalZeros.length && 
		rowColumn1 < subDiagonalOnes.length;rowColumn1++) {
			boolean containsZerosOnSubDiagonal = false;
			// Check 0s only
			if(subDiagonalZeros[rowColumn1][1][0]==1) {
				int[] positions = subDiagonalZeros[rowColumn1][0];
				System.out.println("All 0s on sub diagonal from (" +
				positions[0] + ',' + positions[1] + ") to (" + 
				positions[2] + ',' + positions[3] + ')');
				if(!containsOnSubDiagonal) {
					containsOnSubDiagonal = true;
				}
				containsZerosOnSubDiagonal = true;
			}
			// Check 1s only
			if(!containsZerosOnSubDiagonal && subDiagonalOnes[rowColumn1][1][0]==1) {
				int[] positions = subDiagonalZeros[rowColumn1][0];
				System.out.println("All 1s on sub diagonal from (" +
				positions[0] + ',' + positions[1] + ") to (" + 
				positions[2] + ',' + positions[3] + ')');
				if(!containsOnSubDiagonal)
					containsOnSubDiagonal = true;
			}
		}
		
		if(!containsOnSubDiagonal)
			System.out.println("No same numbers on the sub diagonal ");
		
		
		// Close scanner
		scanner.close();
	}
	
	public static void modifyMatrix(boolean[][] matrix) {
		
		for(int i = 0; i < matrix.length;i++) 
			for(int j = 0; j < matrix.length;j++)
				if((byte)(Math.random()*2)==0)
					matrix[i][j] = !matrix[i][j];
	}
	
	public static void display(boolean[][] matrix) {
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix.length;j++) {
				if(matrix[i][j])
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
	
	public static boolean[] findZeroRowsOrColumns(
	boolean[][] matrix, boolean checkRows, boolean checkZeros) {
		
		boolean[] zerosOrOnesOnly = new boolean[matrix.length]; 
		boolean zerosOrOnes;
		
		for(int i = matrix.length-1;i>=0;i--) {
			zerosOrOnes = true;
			for(int j = matrix.length-1;j>=0;j--) 
				// A one is found in a row which suppose to have zeros only.
				if(checkRows && matrix[i][j] && checkZeros) {
					zerosOrOnes = false;
					break;
				}
			    // A one is found in a column which suppose to have zeros only.
				else if(!checkRows && matrix[j][i] && checkZeros) {
					zerosOrOnes = false;
					break;
				}
			   // A zero is found in a row which suppose to have ones only.
				else if(checkRows && !matrix[i][j] && !checkZeros) {
					zerosOrOnes = false;
					break;
				}
				// A zero is found in a column which suppose to have ones only.
				else if(!checkRows && !matrix[j][i] && !checkZeros) {
					zerosOrOnes = false;
					break;
				}
			if(zerosOrOnes)
				zerosOrOnesOnly[i] = true;
			
		}
		
		return zerosOrOnesOnly;
	}
	
	public static int[][][] findMajorDiagonal(
	boolean[][] matrix, boolean checkZeros){
		
		int[][][] data = new int[(matrix.length-2)*2+1][4][1];
		/* Determines whether to deal with top/bottom part of 
		 * the main left to right diagonal.*/
		boolean dealWithTop = true;
		
		int index = 0;
		
		for(int row = 0; row < data.length;row++) {
			
			// Deal with the top of the main diagonal.
			if(dealWithTop) {
				if(index <=matrix.length-2) {
					data[row] = new int[][]{
					// Beginning row and column indices at index 0 and 1.
					/* Ending row and column indices at index 
					 * matrix.length-1-index and matrix.length-1.*/
					new int[] {0,index,matrix.length-1-index,matrix.length-1}, 
					/* Initially we assume there are no diagonals 
					 * with only 1s or 0s.*/
					new int[] {(zerosOrOnesOnlyOnMajor(
							matrix,0,index,matrix.length-1-index,
					matrix.length-1, checkZeros))?1:0}};
				}
				dealWithTop = false;
				index++;
			}
			// Deal with the bottom of the main diagonal.
			else {
			
				if(index <=matrix.length-2) {
					data[row] = new int[][]{
					// Beginning row and column indices at index 0 and 1.
					/* Ending row and column indices at index 
					* matrix.length-1 and matrix.length-1-index.*/
					new int[] {index,0,matrix.length-1,matrix.length-1-index}, 
					/* Initially we assume there are no diagonals 
					* with only 1s or 0s.*/
					new int[] {(zerosOrOnesOnlyOnMajor(matrix,index,0,matrix.length-1,
					matrix.length-1-index,checkZeros))?1:0}};
				}
				dealWithTop = true;
				
			}
		}
		return data;
	}
	
	public static int[][][] findSubDiagonal(
	boolean[][] matrix, boolean checkZeros){
				
		int[][][] data = new int[(matrix.length-2)*2+1][4][1];
		/* Determines whether to deal with top/bottom part of 
		* the main left to right diagonal.*/
		boolean dealWithTop = true;
				
		int index = 1;
				
		for(int row = 0; row < data.length;row++) {
					
			// Deal with the top of the main diagonal.
			if(dealWithTop) {
				if(index <=matrix.length-1) {
					data[row] = new int[][]{
					// Beginning row and column indices at index 0 and 1.
					/* Ending row and column indices at index 
					 * matrix.length-1 and 0.*/
					new int[] {0,index,index,0}, 
					/* Initially we assume there are no diagonals 
					* with only 1s or 0s.*/
					new int[] {(zerosOrOnesOnlyOnSub(
					matrix, 0,index,index,0, checkZeros))?1:0}};
				}
				dealWithTop = false;
				index++;
			}
			// Deal with the bottom of the main diagonal.
			else {
					
				if(index <=matrix.length-1) {
					data[row] = new int[][]{
					// Beginning row and column indices at index 0 and 1.
					/* Ending row and column indices at index 
					* matrix.length-1 and matrix.length-1-index.*/
					new int[] {index-1,matrix.length-1,
					matrix.length-1,index-1}, 
					/* Initially we assume there are no diagonals 
					* with only 1s or 0s.*/
					new int[] {(zerosOrOnesOnlyOnSub(matrix,index-1,matrix.length-1,
					matrix.length-1,index-1,checkZeros))?1:0}};
				}
				dealWithTop = true;
						
			}
		}
		return data;
	}
	
	public static boolean zerosOrOnesOnlyOnMajor(boolean[][] matrix,
	int row1, int column1, int row2, int column2,
	boolean checkZeros) {
		
		int row = row1;
		int column = column1;
			
			for(;row<=row2 && column<=column2;row++,column++)
				if((matrix[row][column] && checkZeros)
				|| (!matrix[row][column] && !checkZeros))
					return false;		
		
		return true;
		
	}
	
	public static boolean zerosOrOnesOnlyOnSub(boolean[][] matrix,
	int row1, int column1, int row2, int column2,
	boolean checkZeros) {
				
		int row = row1;
		int column = column1;
					
		for(;row<=row2 && column>=column2;row++,column--)
			if((matrix[row][column] && checkZeros)
			|| (!matrix[row][column] && !checkZeros))
				return false;		
				
		return true;
				
	}
}
