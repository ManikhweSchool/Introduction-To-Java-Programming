
public class Exercise_5_39 {

	public static void main(String[] args) {
		
		final double FIRST_COMMISSION_RATE = 0.08;
		final double SECOND_COMMISSION_RATE = 0.1;
		final double THIRD_COMMISSION_RATE = 0.12;
		
		double salesAmount = 0;
		double commissionAmount = 0;
		
		while(commissionAmount < 30000) {
			if(salesAmount<=5000 && salesAmount > 0.01) {
				commissionAmount = salesAmount*FIRST_COMMISSION_RATE;
			}
			else if(salesAmount<=10000 && salesAmount >= 5000.01)
				commissionAmount = salesAmount*FIRST_COMMISSION_RATE
				+ (salesAmount-5000)*SECOND_COMMISSION_RATE;
			else
				commissionAmount = salesAmount*FIRST_COMMISSION_RATE
				+ salesAmount*SECOND_COMMISSION_RATE +
				+ (salesAmount-10000)*THIRD_COMMISSION_RATE;
			salesAmount += 0.01;
		}

		// Question 1.
		System.out.print("The minimum sales amount needed to earn\n"
		+ "a commission of $30000 is $" + (salesAmount-0.01));
	}

}
