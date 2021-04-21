package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramExFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		//abertura da conta
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		System.out.println("Is there an initial deposit? y/n: ");
		char depositFlag = sc.next().charAt(0);
		
		double value = 0;
		if (depositFlag == 'y') {
			System.out.println("Enter inital deposit value: ");
			value = sc.nextDouble();
			acc = new Account(account, name, value);
		} else {
			acc = new Account(account, name);
		}
		
		System.out.println("Account Data:");
		System.out.println(acc);
		
		//demonstração do deposito sendo realizado
		System.out.println("Enter a deposit value: ");
		value = sc.nextDouble();
		acc.addBalance(value);
		System.out.println("Updated Account Data:");
		System.out.println(acc);
		
		//demonstração do deposito sendo realizado
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		acc.removeBalance(value);
		System.out.println("Updated Account Data:");
		System.out.println(acc);
		
		sc.close();
	}
	
	
}
