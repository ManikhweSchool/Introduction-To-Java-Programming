
public class Exercise_1_10c {

	public static void main(String[] args) {
		
		// Average Speed =  Distance/ Time
		// But we need to convert distance to miles and time to hours.
		
		// We first find the distance value in correct units.
		// 1 mile = 1.6 kilometers
		// ? miles = 14 kilometers
		// Let call the question mark Distance.
		// So, Distance is what we looking for.
		// If we cross multiply we get the following.
		// 1.6*Distance = 1*14 -> 1.6*Distance = 14
		// We divide both sides by 1.6 to get Distance. Now we have
		// Distance = 14/1.6 = 8.75 miles
		
		// Secondly we find time value in correct units.
		// Firstly we convert everything to seconds.
		// 1 minute = 60 seconds -> 45 minute = 45*60.
		// 45 minute + 30 seconds = 30 + 45*60 = 2730 seconds.
		// 1 hour = 3600 seconds
		// ? hours = 2730 seconds
		// Let call the question marK Time.
		// So, Time is what we looking for.
		// If we cross multiply we get the following.
		// 3600*Time = 1*2730 -> 3600*Time = 2730
		// We divide both sides by 3600 to get Time. Now we have
		// Time = 2730/3600 = 0.7583333333333333 hours
		
		// Finally, Average Speed =  Distance/ Time
		// Average Speed = 8.75/0.7583333333333333

		// You can use the System.out.printf method to display formatted output on the console.
		// I know this is not covered in chapter one.
		// 4 - field width. The maximum digit before the decimal point. Any number >= 2 will work.
		// 2 - precision. The number of digits after the decimal point.
		// f - format specifier. It is a conversion code. It tells a compiler that this is a float number.
		// % - always require if you using printf.
		System.out.println("Best Solution");
		// Include \n if you want to do text wrapping/next-line.
		System.out.printf("The average speed in miles "
		+ "per hour of a runner running\n14 kilometers in "
		+ "45 minute and 30 seconds is : %3.2f", 8.75/0.7583333333333333);
	}

}
