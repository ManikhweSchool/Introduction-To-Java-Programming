
public class Exercise_1_4b {
	// Student B uses tab in order to deal with spaces.
	public static void main(String[] args) {
		
		/* The correct way of doing it is by using tab which is represented
		 by \t. This makes horizontal spaces. Now our answers will work
		 well regardless of the number of digits for a certain answer.*/
		System.out.println("\na^1\ta^2\ta^3");
		System.out.println("1\t"+1*1+"\t"+1*1*1);
		System.out.println("2\t"+2*2+"\t"+2*2*2);
		System.out.println("3\t"+3*3+"\t"+3*3*3);
		System.out.println("4\t"+4*4+"\t"+4*4*4);
		
		/* The idea is you keep using the multiply arithmetic operator. 
		 * You can put as many tabs as you want to get the desired output.*/
		System.out.println("\na^1\t\ta^4\t\ta^5");
		System.out.println("1\t\t"+1*1*1*1+"\t\t"+1*1*1*1*1);
		System.out.println("2\t\t"+2*2*2*2+"\t\t"+2*2*2*2*2);
		System.out.println("3\t\t"+3*3*3*3+"\t\t"+3*3*3*3*3);
		System.out.println("4\t\t"+4*4*4*4+"\t\t"+4*4*4*4*4);
	}

}
