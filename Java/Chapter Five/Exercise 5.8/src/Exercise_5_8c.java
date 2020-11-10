import java.util.Scanner;

public class Exercise_5_8c {

	public static void main(String[] args) {
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
			
		// Prompts the user to enter number of students.
		System.out.print("Enter number of students : ");
		short numberOfStudents = scanner.nextShort();
		
		// Hold the high performer's name
		String highStudent = null;
		double highScore = Double.MIN_VALUE;
		
		String studentName = null;
		double studentScore = Double.MIN_VALUE;
		
		for(int i = 0; i < numberOfStudents;i++) {
			System.out.print("Enter a student's name and score : ");
			studentName = scanner.next();
			studentScore = scanner.nextDouble();
			
			if(studentScore<0) {
				System.out.print("Error : Mark Can't Be Negetive.");
				System.exit(0);
			}
			
			if(studentName.isEmpty()) {
				System.out.print("Error : Name Can't Be Empty.");
				System.exit(1);
			}
			
			if(highScore < studentScore) {
				highScore = studentScore;
				highStudent = studentName;
			}
		}
		
		System.out.println("\nStudent Name : " 
		+ highStudent + "\nHigh Score : " + highScore);
		
		scanner.close();
	}
}
