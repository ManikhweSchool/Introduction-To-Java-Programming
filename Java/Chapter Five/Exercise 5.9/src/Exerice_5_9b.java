import java.util.Scanner;

public class Exerice_5_9b {

	public static void main(String[] args) {
		
		// Create A Scanner To Read User Input.
		Scanner reader = new Scanner(System.in);

		// Prompts a user to enter the number of students.
		System.out.print("Enter number of students : ");
		short numberOfStudents = reader.nextShort();
		
		if(numberOfStudents >=2) {
			String numberOneStudentName = null;
			double numberOneStudentScore = -1;
			
			String numberTwoStudentName = null;
			double numberTwoStudentScore = -1;
			
			String currentStudentName = null;
			double currentStudentScore = -1;
			
			for(int studentNumber = 1; studentNumber <= numberOfStudents;
			studentNumber++) {
				System.out.print("Enter a student's name and score : ");
				currentStudentName = reader.next();
				currentStudentScore = reader.nextDouble();
				
				if(currentStudentScore <0 || currentStudentName.length()==0) {
					System.out.print("Error : Invalid User Input.");
					System.exit(0);
				}
				
				if(currentStudentScore > numberOneStudentScore) {
					numberTwoStudentScore = numberOneStudentScore;
					numberTwoStudentName = numberOneStudentName;
					numberOneStudentScore = currentStudentScore;
					numberOneStudentName = currentStudentName;
				}
			}
			
			System.out.print("Number One Name : " +
			numberOneStudentName + "\tNumber One Score : " +
			numberOneStudentScore + "\nNumber Two Name : " +
			numberTwoStudentName + "\tNumber Two Score : " +
			numberTwoStudentScore);
		}
		else {
			System.out.println("Error : Make Sure There Are Atleast Two Students.");

		}
		
		
		
		// Close scanner
		reader.close();
	}

}
