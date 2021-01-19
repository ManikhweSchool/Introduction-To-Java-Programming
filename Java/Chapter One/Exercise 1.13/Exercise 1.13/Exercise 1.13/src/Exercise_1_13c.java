
public class Exercise_1_13c {

	// Student C uses tab for horizontal line spacing and proper formatting.
	public static void main(String[] args) {
		
		// a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9
		// x = (e*d-b*f)/(a*d - b*c) y = (a*f-e*c)/(a*d-b*c)

		// Use \t to leave horizontal space in one line.
		System.out.print(3.4 + "x + "+ 50.2 + "y " + "= " + 44.5 + "\t");
		System.out.println(2.1 + "x + "+ .55 + "y " + "= " + 5.9 );
		// You can use the System.out.printf method to display formatted output on the console.
		// 1 - field width. The maximum digit before the decimal point. Any number >= 1 will work.
		// 2 - precision. The number of digits after the decimal point.
		// f - format specifier. It is a conversion code. It tells a compiler that this is a float number.
		// % - always require if you using printf.
		System.out.printf("x = %1.2f\t",(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1));
		System.out.printf("y = %1.2f",(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1));
	}

}
