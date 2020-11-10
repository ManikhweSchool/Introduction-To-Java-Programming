import java.util.Scanner;

public class Exercise_4_19a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter nine digits.
		System.out.print("Enter the first 9 digits "
		+ "of an ISBN as integer : ");
		String stringISBN = scanner.nextLine();
		
		if(!(stringISBN.length()==9 && stringISBN.charAt(0)=='0')) {
			System.out.print("Invalid input");
			System.exit(0);
		}
			
		
		int ninthProduct = Integer.parseInt(stringISBN.substring(8, 9))*9;
		int eigtheenProduct = Integer.parseInt(stringISBN.substring(7, 8))*8;
		int seventhProduct = Integer.parseInt(stringISBN.substring(6, 7))*7;
		int sixthProduct = Integer.parseInt(stringISBN.substring(5, 6))*6;
		int fifthProduct = Integer.parseInt(stringISBN.substring(4, 5))*5;
		int forthProduct = Integer.parseInt(stringISBN.substring(3, 4))*4;
		int thirdProduct = Integer.parseInt(stringISBN.substring(2, 3))*3;
		int secondProduct = Integer.parseInt(stringISBN.substring(1, 2))*2;
		
		int sumOfProduct = secondProduct;
		sumOfProduct += thirdProduct;
		sumOfProduct += forthProduct;
		sumOfProduct += fifthProduct;
		sumOfProduct += sixthProduct;
		sumOfProduct += seventhProduct;
		sumOfProduct += eigtheenProduct;
		sumOfProduct += ninthProduct;
		
		int determinant = sumOfProduct%11;
		
		System.out.print("The ISBN-10 number is " + stringISBN);
		
		if(determinant==10)
			System.out.print("X");
		else
			System.out.print(determinant);
		
		scanner.close();
	}

}
