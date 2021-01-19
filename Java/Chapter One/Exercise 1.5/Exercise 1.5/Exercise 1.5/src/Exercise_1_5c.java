
public class Exercise_1_5c {

	// Student C has a readable answer.
	public static void main(String[] args) {
		
		// Step 1 - Write down the order of the operator precedence for the expression.
		// Numerator - Multiply, Multiply, Subtract
		// Denominator - Subtract
	    // Step 2 - Surround each two operands and an operator with brackets based on the precedent.
		// Step 3 - Divide numerator by denominator to find the final answer.
		
		// 
		//(9.0*4.5) (2.5*3) (45.5-3)
		// Numerator - (9.0*4.5)-(2.5*3) -> ((9.0*4.5)-(2.5*3))
		// Denominator - (45.5-3)
		// Final answer - ((9.0*4.5)-(2.5*3))/ (45.5-3)
		
		System.out.print("((9.0*4.5)-(2.5*3))/ (45.5-3) = " + (((9.0*4.5)-(2.5*3))/ (45.5-3)));
		
	}

}
