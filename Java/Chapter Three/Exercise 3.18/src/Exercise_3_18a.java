import java.util.Scanner;

public class Exercise_3_18a {

	//  http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package : ");
		double weight = scanner.nextDouble();
		
		if(weight <= 1 && weight >0) 
			System.out.print("Cost is $" + 3.5 + ".");
		
		else if(weight <= 3 && weight > 1)
			System.out.print("Cost is $" + 5.5 + ".");
		else if(weight <=10 && weight >3)
			System.out.print("Cost is $" + 8.5);
		else if(weight <= 20 && weight > 10)
			System.out.print("Cost is $" + 10.5 + ".");
		else if (weight > 50)
			System.out.print("The package cannot be shipped.");
		
		
		scanner.close();
	}

}
