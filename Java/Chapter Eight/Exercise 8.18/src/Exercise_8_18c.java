
public class Exercise_8_18c {

	public static void main(String[] args) {
		
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}}; 
		
		displayMatrix(m);
		shuffle(m);
		System.out.println();
		displayMatrix(m);
	}
	
	public static void displayMatrix(int[][] matrix) {
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void shuffle(int[][] m) {
		
		for(int i = 0; i < m.length;i++) {
			byte index1 = (byte)(Math.random()*m.length);
			byte index2 = (byte)(Math.random()*m.length);
			
			int[] tempArray = m[index1];
			m[index1] = m[index2];
			m[index2] = tempArray;
		}
	}
}
