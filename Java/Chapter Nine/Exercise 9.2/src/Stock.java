
public class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercentage() {
		
		return 
		((Math.abs(currentPrice-previousClosingPrice))
		/currentPrice)*100;
	}
	
	public void setName(String name) {this.name = name;}
	
	public String getName() { return name;}
	
	public String getSymbol() { return symbol;}
	
	public void setSymbol(String symbol) { this.symbol = symbol;}
	
	public void setPreviousPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public double getPreviousClosingPrice() { 
		return previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getCurrentPrice() { 
		return previousClosingPrice;
	}
}
