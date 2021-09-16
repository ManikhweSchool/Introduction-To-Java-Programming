
public class Exercise_8_10a {

	public static void main(String[] args) {
		
		boolean[][] matrix = new boolean[4][4];
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix.length;j++) {
				matrix[i][j] = (int)(Math.random()*2)==1;
			}
		}
		
		displayMatrix(matrix);
		
		byte maxRowIndex = 0;
		byte maxColumnIndex = 0;
		
		for(byte index = 1; index < 4;index++) {
			if(findNumberOfOnes(matrix,maxRowIndex,true)<
			findNumberOfOnes(matrix,index,true))
				maxRowIndex = index;
			if(findNumberOfOnes(matrix,maxColumnIndex,false)<
			findNumberOfOnes(matrix,index,false))
				maxColumnIndex = index;
		}
		
		System.out.println("The largest row index : " + maxRowIndex);
		System.out.println("The largest column index : " + maxColumnIndex);
	}
	
	public static byte findNumberOfOnes(boolean[][] matrix,
	byte index, boolean onRows) {
		
		byte count = 0;
		
		if(onRows) {
			for(int column = 0; column < matrix[index].length;column++) 
				if(matrix[index][column])
					count++;
			
		}
		else {
			for(int row = 0; row < matrix.length;row++) 
				if(matrix[row][index])
					count++;
		}
		
		return count;
	}
	
	public static void displayMatrix(boolean[][] matrix) {
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[0].length;j++) {
				if(matrix[i][j]) {
					if(j==3 || j==7 || j==11)
						System.out.println("1");
					else
						System.out.print("1 ");
				}
				else {
					if(j==3 || j==7 || j==11)
						System.out.println("0");
					else
						System.out.print("0 ");
				}
			}
		}
	}

}
