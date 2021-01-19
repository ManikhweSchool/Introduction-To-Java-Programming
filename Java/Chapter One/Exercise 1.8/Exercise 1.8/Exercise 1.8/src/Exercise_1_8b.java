
public class Exercise_1_8b {

	public static void main(String[] args) {
		
		
		// The + in front of 2 is not acting as an addition operator in this case.
		// Instead it is used to combine/concatenate the string and the value to the right of it.
		System.out.println("The perimeter of a circle with radius 5.5 is : " + 2*5.5*Math.PI);
		// Because we are looking for an exponent operation for 5^2 we can use the Math class.
		System.out.println("The area of a circle with radius 5.5 is : " + Math.pow(5.5, 2)*Math.PI);
		
		// Again, whenever you have got to perform some mathematical calculations you should first check the math class.
	}

}
