import java.util.Scanner;

public class Exercise_8_6b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		
		int row,col;
		System.out.print("Enter matrix1 : ");
		for(row = 0;row < 3;row++)
			for(col = 0; col < 3;col++)
				matrix1[row][col] = scanner.nextDouble();
		
		System.out.print("Enter matrix2 : ");
		for(row = 0;row < 3;row++)
			for(col = 0; col < 3;col++)
				matrix2[row][col] = scanner.nextDouble();
		
		double[][] product = multiplyMatrix(matrix1, matrix2);
		
		display(matrix1,matrix2,product);
		scanner.close();
	}
	
	public static void display(double[][] a, double[][] b, double[][] c) {
		
		for(int row = 0; row < c.length;row++) {
			double number;
			for(int col = 0; col < 9;col++) {
				if(col<3) 
					number = a[row][col];
				else if(col<6)
					number = b[row][col-3];
				else
					number = c[row][col-6];
				
				System.out.printf("%1.1f",number);
				if(col==2 && row==1) 
					System.out.print("\t*\t");
				else if(col==5 && row==1) 
					System.out.print("\t=\t");
				else if(col==2 || col==5) 
					System.out.print("\t\t");
				else if(col==8)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		if(areCompitable(a,b)) {
			double[][] c = new double[a.length][b[0].length];
			double sum;
			
			for(int aRow = 0; aRow < a.length;aRow++) {
				for(int bColumn = 0; bColumn < b[0].length;bColumn++) {
					sum = 0;
					
					for(int index = 0; index < b.length;index++)
						sum += a[aRow][index]*b[index][bColumn];
					
					c[aRow][bColumn] = sum;
				}
			}
			
			return c;
		}
		
		return null;
	}
	
	public static boolean areCompitable(double[][] a, double[][] b) {
		
		return isMatrixValid(a) && 
		isMatrixValid(b) && 
		a.length==b[0].length;
	}
	
	public static boolean isMatrixValid(double[][] matrix) {
		
		int count = matrix[0].length;
		
		for(int i = 0; i < matrix.length;i++)
			if(matrix[i].length != count)
				return false;
		return true;
	}

}
