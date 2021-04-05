
public class Exercise_7_23a {

	public static void main(String[] args) {
		
		boolean[] states = new boolean[100];
		
		for(int studentNumber = 1; studentNumber <=100;studentNumber++) {
			if(studentNumber==1 || studentNumber==2) {
				for(int i = studentNumber-1; i < states.length;i++) {
					states[i] = !states[i];
				}
			}
			else {
				int count = 0;
				for(int i = studentNumber-1; i < states.length;i++) {
					if(count%studentNumber==0)
						states[i] = !states[i];
					count++;
				}
			}
		}
		
		displayLockers(states);
		
	}
	
	public static void displayLockers(boolean[] states) {
		
		System.out.println("List Of All Open Lockers\n");
		
		for(int i = 1; i <= states.length;i++) 
			if(states[i-1]) 
				System.out.print("L" + i + ' ');
	}

}
