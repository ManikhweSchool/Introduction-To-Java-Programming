import java.util.Scanner;

public class Exercise_3_18b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the weight of the package : ");
		double packageWeight = scanner.nextDouble();
		
		if(packageWeight > 0) {
			System.out.print("Cost is $");
			if(packageWeight <=1 && packageWeight >0)
				System.out.print(3.5 + ".");
			else if(packageWeight <=3 && packageWeight >1)
				System.out.print(5.5 + ".");
			else if(packageWeight <=10 && packageWeight >3)
				System.out.print(8.5 + ".");
			else if(packageWeight <=20 && packageWeight >10)
				System.out.print(10.5 + ".");
			else if(packageWeight > 50)
				System.out.print("The package cannot be shipped.");
			else
				System.out.print("The program doesn't "
				+ "process packages\nwith weight greater than 20.");
		}
		
		else 
			System.out.print("A package cannot have a negetive weight.");
		
		// Close scanner
		scanner.close();
	}

}
