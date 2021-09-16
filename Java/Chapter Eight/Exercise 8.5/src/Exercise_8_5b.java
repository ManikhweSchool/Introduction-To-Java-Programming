import java.util.Scanner;

public class Exercise_8_5b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		int i,j;
		
		System.out.print("Enter matrix1 : ");
		double[][] a = new double[3][3];
		
		for(i = 0; i < 3;i++)
			for(j = 0; j < 3;j++)
				a[i][j] = scanner.nextDouble();
		
		System.out.print("Enter matrix2 : ");
		double[][] b = new double[3][3];
		
		for(i = 0; i < 3;i++)
			for(j = 0; j < 3;j++)
				b[i][j] = scanner.nextDouble();
		
		display(a,b,addMatrix(a,b));
		
		// Close scanner
		scanner.close();
	}
	
	public static void display(double[][] a, double[][] b, double[][] c) {
		
		for(int row = 0; row < 3;row++) {
			for(int column = 0; column < 9;column++) {
				if(column==8)
					System.out.println(c[row][column%3]);
				else if(row==1 && column==2)
					System.out.print(a[row][column%3] + "\t+\t");
				else if(column<2)
					System.out.print(a[row][column%3] + " ");
				else if((row == 0 || row == 2) && column==2)
					System.out.print(a[row][column%3] + "\t\t");
				else if(row != 1 && column==5)
					System.out.print(b[row][column%3] + "\t\t");
				else if(row == 1 && column==5)
					System.out.print(b[row][column%3] + "\t=\t");
				else if(column < 6)
					System.out.print(b[row][column%3] + " ");
				else
					System.out.print(c[row][column%3] + " ");
			}
		}
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		if(a.length==b.length && a[0].length==b[0].length) {
			double[][] c = new double[a.length][b[0].length];
			for(int i = 0; i < c.length;i++)
				for(int j = 0; j < c[0].length;j++)
					c[i][j] = a[i][j] + b[i][j];
			
			return c;
		}
		
		return null;
	}

}
