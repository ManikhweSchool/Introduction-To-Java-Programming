import java.util.Scanner;

public class Exercise_5_8a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter number of students.
		System.out.print("Enter number of students : ");
		short numberOfStudents = scanner.nextShort();
		
		// Hold the high performer's name
		String highStudent = null;
		double highScore = Double.MIN_VALUE;
		
		// List of  student names and scores.
		String studentList = "";
		String scoreList = "";
		
		// Create a list of student names and student scores.
		while(numberOfStudents>0) {
			System.out.print("Enter a student's name and score : ");
			studentList += scanner.next() + " ";
			scoreList += scanner.nextDouble() + " ";
			numberOfStudents--;
		}
		
		// Lwandile John Max
		// 84 76 99
		
		String studentName = null;
		double studentScore = Double.MIN_VALUE;
		
		while(studentList.contains(" ") &&
		scoreList.contains(" ")) {
			studentName = studentList.substring(0,
			studentList.indexOf(" "));
			studentScore = Double.parseDouble(scoreList.substring(0,
			scoreList.indexOf(" ")));
			
			// Compare high performer with the current student.
			if(highScore<studentScore) {
				highScore = studentScore;
				highStudent = studentName;
			}
			
			studentList = studentList.substring(studentList.indexOf(" ")+1);
			scoreList = scoreList.substring(scoreList.indexOf(" ") + 1);
		}
		
		
		
		System.out.println("\nStudent Name : " 
		+ highStudent + "\nHigh Score : " + highScore);
		
		// Close scanner
		scanner.close();
	}

}
