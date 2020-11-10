import java.util.Scanner;

public class Exercise_3_21b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	/*
	 * The values of of j, k and h are calculated more than once unnecessarily.
	 * */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter a year.
		System.out.print("Enter year (e.g. 2012) : ");
		int year = scanner.nextInt();
		
		if(year < 0) {
			System.out.print("Error : Year has to be a positive number.");
			System.exit(0);
		}
		
		// Prompts the user to enter a month.
		System.out.print("Enter month 1-12 : ");
		byte m = scanner.nextByte();
		
		if(m<1 || m >12) {
			System.out.print("Error : Make sure your month is between 1-12.");
			System.exit(1);
		}
		
		// Prompts the usert to enter the day of the month.
		System.out.print("Enter the day of the month 1-31 : ");
		int q = scanner.nextInt();
		
		if(q < 1 || q > 31) {
			System.out.print("Error : Make sure day is between 1-31");
			System.exit(2);
		}
		
		int j;
		int k;
		int h;
		
		// Deal with January and February.
		if(m==1 || m==2) {
			year--;
			m += 12;
		}
		
		k = year%100;
		j = year/100;
		
		h = (q + ((26*(m+1))/10) + k + k/4 + j/4 + 5*j)%7;
		
		System.out.print("Day of the week is ");
		
		switch(h) {
		case 0 :
			System.out.print("Surtaday");
			break;
		case 1 :
			System.out.print("Sundary");
			break;
		case 2 :
			System.out.print("Monday");
			break;
		case 3 :
			System.out.print("Tuesday");
			break;
		case 4 :
			System.out.print("Wednesday");
			break;
		case 5 :
			System.out.print("Thursday");
			break;
		default :
			System.out.print("Friday");
		}
		
		scanner.close();
	}

}
