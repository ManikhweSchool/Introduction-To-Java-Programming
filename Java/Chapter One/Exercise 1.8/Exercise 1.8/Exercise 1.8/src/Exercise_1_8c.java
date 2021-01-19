
public class Exercise_1_8c {

	// Student C decided to round of answers to two decimal places.
	public static void main(String[] args) {
		

		// We round of our answer to two decimal places.
		// You can use the System.out.printf method to display formatted output on the console.
		// I know this is not covered in chapter one.
		// 3 - field width. The maximum digit before the decimal point. Any number >= will work.
		// 2 - precision. The number of digits after the decimal point.
		// f - format specifier. It is a conversion code. It tells a compiler that this is a float number.
		// % - always require if you using printf.
		System.out.println("Best Solution");
		System.out.printf("The perimeter of a circle with radius 5.5 is : %3.2f", 2*5.5*Math.PI);
		System.out.printf("\nThe area of a circle with radius 5.5 is : %3.2f", Math.pow(5.5, 2)*Math.PI);
		
		// Again, whenever you have got to perform some mathematical calculations you should first check the math class.
	}

}
