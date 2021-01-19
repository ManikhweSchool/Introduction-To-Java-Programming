
public class Exercise_1_9c {

	public static void main(String[] args) {
		
		// We round of our answer to two decimal places.
		// You can use the System.out.printf method to display formatted output on the console.
		// I know this is not covered in chapter one.
		// 2 - field width. The maximum digit before the decimal point. Any number >= 2 will work.
		// 2 - precision. The number of digits after the decimal point.
		// f - format specifier. It is a conversion code. It tells a compiler that this is a float number.
		// % - always require if you using printf.
		System.out.printf("The area of a rectangle with wight of 4.5 and height of 7.9 is : %2.2f", 4.5*7.9);
		
		// Again, whenever you have got to perform some mathematical calculations you should first check the math class.
		// There is a way to round of your answer to say 2 decimal places.
		// However i am not going to do that on this episode, we will see how it works when we doing strings.
		// By the way it called string formatting using printf in case you would like to check it out.
	}

}
