package entities;

public class Operation {

	private int accountNumber;
	public String name;
	private double amount;

	public Operation(int accountNumber, String name, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		setAmount(amount);
	}

	public Operation(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = 0.0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount += amount;
	}

	public void withdrawAmount(double amount) {
		this.amount = (this.amount - amount) -  5;
	}

	public String toString() {
		return "Account " + this.accountNumber + ", Holder: " + this.name + ", Balance: $" +String.format("%.2f", getAmount());
	}
}
