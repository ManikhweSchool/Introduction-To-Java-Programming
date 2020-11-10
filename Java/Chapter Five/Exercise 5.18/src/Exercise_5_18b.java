
public class Exercise_5_18b {

	public static void main(String[] args) {
		/*
		System.out.println("Pattern A");
		
		for(int i = 1; i <=6;i++) {
			for(int j = 1; j <= i;j++)
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println("Pattern B");
		for(int i = 6; i >= 0;i--) {
			for(int j =1; j <=i;j++) 
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println("Pattern C"); 
		for(byte row = 1; row <= 6; row++) {
			for(byte column = 6; column>=1;column--)
				System.out.print((column>row)?"\t":column+"\t");
			System.out.println();
		}
		*/
		System.out.println("Pattern D"); 
		for(byte row = 0; row < 6; row++) {
			for(byte numberOfSpaces = 0; numberOfSpaces<row;numberOfSpaces++)
				System.out.print("\t");
			for(byte column = 1; column <= 6-row;column++) 
				System.out.print(column + "\t");
			
			System.out.println();
		}
		
	}

}
