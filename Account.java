package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	public int getNumber() {
		return number;
	}
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
		
	public String toString() {
		return "Account"
				+ number
				+ ", Holder"
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
