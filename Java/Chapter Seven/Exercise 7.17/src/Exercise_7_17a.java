import java.util.Scanner;

public class Exercise_7_17a {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		int numberOfStudents;
		System.out.print("Enter number of students : ");
		numberOfStudents = scanner.nextInt();
		
		if(numberOfStudents<=0)System.exit(0);
		
		int i;
		
		System.out.print("\nEnter students' names : ");
		String[] studentNames = new String[numberOfStudents];
		for(i = 0; i < numberOfStudents;i++)
			studentNames[i] = scanner.next();
		
		System.out.print("\nEnter students' scores : ");
		double[] studentScores = new double[numberOfStudents];
		for(i = 0; i < numberOfStudents;i++)
			studentScores[i] = scanner.nextDouble();
		
		sort(studentNames,studentScores);
		
		for(i = 0; i < studentNames.length;i++)
			System.out.println(studentNames[i] );
			
		
		// Close scanner
		scanner.close();

	}
	
	public static void sort(String[] names, double[] scores) {
		
	}

}
