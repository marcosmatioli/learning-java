package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operation;

public class Program {

	public static void main(String[] args) {

		Operation bank = null;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		int tempAccountNumber = sc.nextInt();

		System.out.println("Enter account holder: ");
		String tempName = sc.next();

		System.out.println("Is there na initial deposit (y/n)?");
		char tempAnswer = sc.next().charAt(0);

		if (tempAnswer == 'y' && bank == null) {

			System.out.println("Enter initial deposit value: ");
			double tempInitialDeposit = sc.nextDouble();
			
			bank = new Operation(tempAccountNumber, tempName, tempInitialDeposit);
			
		} else {
			
			bank = new Operation(tempAccountNumber, tempName);
		}

		System.out.println("Account data: ");
		System.out.println(bank.toString());

		System.out.println("Enter a deposit value: ");
		double tempDeposit = sc.nextDouble();
		bank.setAmount(tempDeposit);

		System.out.println("Update account data:");
		System.out.println(bank.toString());

		System.out.println("Enter a withdraw value: ");
		double tempWithdraw = sc.nextDouble();
		bank.withdrawAmount(tempWithdraw);

		System.out.println("Update account data:");
		System.out.println(bank.toString());

		sc.close();

	}

}
