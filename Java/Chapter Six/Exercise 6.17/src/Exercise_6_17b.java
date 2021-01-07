
public class Exercise_6_17b {

	public static void main(String[] args) {
		
		printMatrix(7);

	}
	
	public static void printMatrix(int n) {
		
		
		
		for(int i = n; i > 0;i--) {
			for(int j = n; j >=1; j--) {
				System.out.print((byte)(Math.random()*2) + " ");
			}
			System.out.println();
		}
		
	}

}
