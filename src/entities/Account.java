package entities;

public class Account {
	private int account;
	private String name;
	private double balance;

	public Account(int account, String name) {
		this.account = account;
		this.name = name;
	}

	public Account(int account, String name, double initialdeposit) {
		this.account = account;
		this.name = name;
		this.addBalance(initialdeposit);
	}

	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}
	
	public void removeBalance(double balance) {
		this.balance -= balance + 5.0;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", name=" + name + ", balance= $ " + String.format("%.2f", balance)
				+ "]";
	}

}