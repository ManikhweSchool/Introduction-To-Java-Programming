
class LameStock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	LameStock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	double getChangePercentage() {
		
		return 
		((Math.abs(currentPrice-previousClosingPrice))
		/currentPrice)*100;
	}
	
	void setName(String name) {this.name = name;}
	
	String getName() { return name;}
	
	String getSymbol() { return symbol;}
	
	void setSymbol(String symbol) { this.symbol = symbol;}
	
	void setPreviousPrice(double previousClosingPrice) {
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
