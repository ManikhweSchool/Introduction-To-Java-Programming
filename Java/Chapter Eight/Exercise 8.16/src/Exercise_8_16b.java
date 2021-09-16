import java.util.Scanner;

public class Exercise_8_16b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter matrix size : ");
		int matrixSize = scanner.nextInt();
		System.out.println("Enter matrix : ");
		int[][] matrix = new int[matrixSize][2];
		
		for(int index = 0; index < matrix.length;index++) {
			matrix[index][0] = scanner.nextInt();
			matrix[index][1] = scanner.nextInt();
		}
		
		sort(matrix);
		display(matrix);
		
		scanner.close();
	}
	
	public static void display(int[][] m) {
		
		for(int i = 0; i < m.length;i++) {
			System.out.println("{" + m[i][0]+','+m[i][1]+'}');
		}
	}
	
	public static void sort(int[][] m, int rowIndex1, int rowIndex2) {
		
		if(rowIndex1 >=0 && rowIndex1 <m.length &&
		rowIndex2 >=0 && rowIndex2 < m.length) {
			if((m[rowIndex1][0] > m[rowIndex2][0]) ||
			(m[rowIndex1][0] == m[rowIndex2][0]) &&
			m[rowIndex1][1] > m[rowIndex2][1]) {
				int temp1 = m[rowIndex1][0];
				int temp2 = m[rowIndex1][1];
				
				m[rowIndex1][0] = m[rowIndex2][0];
				m[rowIndex1][1] = m[rowIndex2][1];
				
				m[rowIndex2][0] = temp1;
				m[rowIndex2][1] = temp2;
			}
		}
	}
	
	public static void sort(int[][] m) {
		
		for(int rowIndex = 0; rowIndex < m.length;rowIndex++) {
			for(int columnIndex = rowIndex+1;columnIndex <m.length;columnIndex++) {
				sort(m,rowIndex,columnIndex);
			}
		}
	}
}
