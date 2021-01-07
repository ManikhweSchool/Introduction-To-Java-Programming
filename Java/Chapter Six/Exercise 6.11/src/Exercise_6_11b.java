
public class Exercise_6_11b {

	public static void main(String[] args) {
		
		displayResult();
	}
	
	public static double  computeCommission(double salesAmount) {
		
		final double FIRST_COMMISSION_RATE = 0.08;
		final double SECOND_COMMISSION_RATE = 0.1;
		final double THIRD_COMMISSION_RATE = 0.12;
		
		double commissionAmount = 0;
		
		if(salesAmount <= 5000 && salesAmount>=0.01)
			commissionAmount = salesAmount*FIRST_COMMISSION_RATE;
		else if(salesAmount <= 10000 && salesAmount>=5000.01)
			commissionAmount = salesAmount*SECOND_COMMISSION_RATE;
		else
			commissionAmount = 5000*FIRST_COMMISSION_RATE + 
			5000*SECOND_COMMISSION_RATE + 
			(salesAmount-10000)*THIRD_COMMISSION_RATE;
		
		return commissionAmount;
	}
	
	public static void displayResult() {
	
		System.out.println("Sale Amount\tCommission");
		System.out.println("--------------------------------------------");
		
		for(int salesAmount = 10000; salesAmount<=100000;salesAmount+=5000) {
			System.out.printf("%d\t\t%7.1f\n", salesAmount,
			computeCommission(salesAmount));
		}
	}

}
