
public class Exercise_9_2c {

	public static void main(String[] args) {
		
		Stock stock = new Stock("ORCL","Oracle Cooperation");
		stock.setCurrentPrice(34.35);
		stock.setPreviousPrice(34.5);
		
		System.out.printf("The price change percentage is : %4.2f", 
		stock.getChangePercentage());
		System.out.print("%");
	}

}
