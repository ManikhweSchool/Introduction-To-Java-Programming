
public class Exercise_1_7b {

	public static void main(String[] args) {
		
		// Firstly we rewrite terms inside the brackets.
		// (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
		// Finally we multiply the whole thing by 4.
		
		// Simple solution
		System.out.println("Simple solution");
		System.out.println();
		System.out.println(4*(1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println(4*(1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
		
		System.out.println();
		
		// Better solution
		System.out.println("Better solution");
		System.out.println();
		System.out.println("First approximation for PI - " + 4*(1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println("Second approximation for PI - " + 4*(1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));

		// The is a way that represent a PI value is java.
		// PI is a constant defined in the Math utility class.
		// The syntax is Math.PI.
		System.out.println("The actual value for PI is - " + Math.PI);
		
		
		
		// We see that as we keep adding value inside the brackets we approach PI.
	}

}
