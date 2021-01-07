
public class Exercise_9_7b {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		account1.setId(1122);
		account1.setBalance(20000);
		Account.setAnnualInterestRate(4.5);
		
		Account account2 = new Account();
		account2.setId(1123);
		account2.setBalance(30000);
		
		System.out.println(account1);
		account1.withdraw(7500);
		account1.deposit(4500);
		System.out.println("\n\n" + account1);
		
		System.out.println(account2);
		account2.withdraw(7930);
		account2.deposit(5050);
		System.out.println("\n\n" + account2);
	}

}
