import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
		
	}
	
	public Account(int id, double balance, Date dateCreated) {
		
		this.id = id;
		this.balance = balance;
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		representation += "Acc ID : " + id;
		representation += ("\nAcc Balance : " + balance);
		representation += ("\nAcc Annual Interest Rate : " + annualInterestRate);
		representation += ("\nAcc Created Date : " + dateCreated);
		
		return representation;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate/100;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;
	}
	
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void withdraw(double amount) {
		if(amount<= balance && amount>0)
			balance -= amount;
	}
	
	public void deposit(double amount) {
		
		if(amount>0) balance += amount;
	}
	
	
}
