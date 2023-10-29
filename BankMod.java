package Entities;

public class BankMod {
	
	private String name;
	private int account;
	private double balance;
	
	public BankMod(String name, int account, double initialDeposit) {
		
		this.name = name;
		this.account = account;
		deposit(initialDeposit);
		
	}
	
	public BankMod(String name, int account) {
		
		this.name = name;
		this.account = account;
		
	}
	
	public BankMod(double balance) {
		
		this.balance = balance;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account: " + account + " Holder: " + name + " Balance: " + String.format("%.2f", balance);
	}

}
