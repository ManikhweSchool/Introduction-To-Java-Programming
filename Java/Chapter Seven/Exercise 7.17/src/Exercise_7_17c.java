import java.util.Scanner;

public class Exercise_7_17c {

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
				
				Student[] students = new Student[numberOfStudents];
				
				for(i = 0; i < numberOfStudents;i++) {
					Student student = new Student();
					student.studentName = studentNames[i];
					student.studentScore = studentScores[i];
					students[i] = student;
				}
				
				sort(students);
				
				for(i = 0; i < students.length;i++)
					System.out.println("Name : " + students[i].studentName + 
					"\tScore : " + students[i].studentScore);
					
				
				// Close scanner
				scanner.close();

	}
	
	public static void sort(Student[] students) {
		
		int maxIndex;
		
		for(int i = 0; students.length-1 > i;i++) {
			maxIndex = i;
			Student topStudent = students[maxIndex];
			for(int j = i+1;j < students.length;j++) {
				Student currentStudent = students[j];
				if(topStudent.studentScore<currentStudent.studentScore) {
					maxIndex = j;
				}
				
			}
			
			if(maxIndex != i) {
				Student tempStudent = students[i];
				students[i] = students[maxIndex];
				students[maxIndex] = tempStudent;
			}
		}
	}


}
