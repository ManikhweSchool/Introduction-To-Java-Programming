
public class Exercise_1_12b {

	public static void main(String[] args) {
		
		// Average Speed =  Distance/ Time
		// But we need to convert distance to kilometers and time to hours.
				
		// We first find the distance value in correct units.
		// 1 mile = 1.6 kilometers
		// 24 miles = ? kilometers
		// Let call the question mark Distance.
		// So, Distance is what we looking for.
		// If we cross multiply we get the following.
		// 1*Distance = 1.6*24 -> Distance = 38.400000000000006
		// Distance = 38.400000000000006 kilometers
				
		// Secondly we find time value in correct units.
		// Firstly we convert everything to seconds.
		// 1 minute = 60 seconds -> 40 minute = 40*60.
		// 1 hour + 40 minute + 35 seconds = 60*60 + 40*60 +35 = 6035 seconds.
		// 1 hour = 3600 seconds
		// ? hours = 6035 seconds
		// Let call the question mark Time.
		// So, Time is what we looking for.
		// If we cross multiply we get the following.
		// 3600*Time = 1*6035 -> 3600*Time = 6035
		// We divide both sides by 3600 to get Time. Now we have
		// Time = 6035/3600 = 1.676388888888889 hours
				
		// Finally, Average Speed =  Distance/ Time
		// Average Speed = 38.400000000000006/1.676388888888889
		System.out.println(38.400000000000006/1.676388888888889);
		System.out.println("Simple Solution");
		System.out.println(38.400000000000006/1.676388888888889);

		System.out.println();
				
		System.out.println("Better Solution");
		System.out.println("The average speed in kilometers "
		+ "per hour of a runner running 24 miles in "
		+ "40 minute and 35 seconds is : " + 38.400000000000006/1.676388888888889);
			
		System.out.println();
		
		System.out.println("Even Better Solution");
		// Include \n if you want to do text wrapping/next-line.
		System.out.println("The average speed in miles "
		+ "per hour of a runner running\n14 kilometers in "
		+ "45 minute and 30 seconds is : " + 38.400000000000006/1.676388888888889);
		
		System.out.println();
		
		// You can use the System.out.printf method to display formatted output on the console.
		// 4 - field width. The maximum digit before the decimal point. Any number >= 2 will work.
		// 2 - precision. The number of digits after the decimal point.
		// f - format specifier. It is a conversion code. It tells a compiler that this is a float number.
		// % - always require if you using printf.
		System.out.println("Best Solution");
		// Include \n if you want to do text wrapping/next-line.
		System.out.printf("The average speed in miles "
		+ "per hour of a runner running\n14 kilometers in "
		+ "45 minute and 30 seconds is : %4.2f",  38.400000000000006/1.676388888888889);
	}

}
