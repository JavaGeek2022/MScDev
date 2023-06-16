package DevelopingKnowledge;

import java.util.Scanner;

public class SavingsAccount {
	int balance;

	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}

	public void checkBalance() {
		// check balance method
		System.out.println("Hello!");
		System.out.println("Your balance is " + balance);
	}

	public void deposit() {
		// deposit method
		Scanner scanner = new Scanner(System.in);

		System.out.println("please input your deposit amount: ");
		int depositAmount = scanner.nextInt();

		balance = balance + depositAmount;
		System.out.println("you're new balance is: " + balance);

		System.out.println("You just deposited " + depositAmount);

		scanner.close();

	}

	public int withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;

		System.out.println("You just withdrew " + amountToWithdraw);
		return amountToWithdraw;
	}

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(2000);

		// Check balance:
		savings.checkBalance();

		/*
		 * //Withdrawing: savings.withdraw(100);
		 * 
		 * //Check balance: savings.checkBalance();
		 * 
		 * //Deposit: savings.deposit(600);
		 * 
		 * //Check balance: savings.checkBalance();
		 */
		// Deposit:
		savings.deposit();

		// Check balance:
		savings.checkBalance();
	}
}
