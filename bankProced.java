package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.BankMod;

public class bankProced {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double balance;
		BankMod bankMod;
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response =='y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankMod = new BankMod(name, account, initialDeposit);
			System.out.println(bankMod);
			System.out.println();
			
		}
		else {
	
			bankMod = new BankMod(name, account);
			
		}
		
		System.out.println();
		System.out.println(bankMod);
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankMod.deposit(deposit);
		
		System.out.println("Updated data: " + bankMod);
		
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankMod.withdraw(withdraw);
	
		System.out.println("Updated data: " + bankMod);
		
		
		sc.close();

	}

}
