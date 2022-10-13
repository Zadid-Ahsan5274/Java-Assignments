// 4. Write a program to check your balance, deposit balance and withdraw balance from ATM booth.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class ATMOperations {

	public static void main(String[] args) {

		int current_balance = 1000000;
		System.out.println("Welcome to ABC Bank ATM...");
		System.out.print("Please enter your PIN: ");
		try {
			Scanner input = new Scanner(System.in);
			int pin_input = input.nextInt();
			int PIN = 1234;
			if (pin_input == PIN) {
				System.out.println("Welcome to your account");
				System.out.println(
						"Choose an operation to proceed: \n 1. Check balance\n 2. Deposit balance\n 3. Withdraw balance");
				int operation = input.nextInt();
				switch (operation) {
				case 1:
					System.out.println("Your current balance is " + current_balance + " Taka");
					break;
				case 2:
					System.out.print("Enter how much you want to deposit: ");
					int deposit_amount = input.nextInt();
					current_balance = current_balance + deposit_amount;
					System.out.println("After depositing " + deposit_amount + " Taka your current balance is "
							+ current_balance + " Taka");
					break;
				case 3:
					System.out.println("Enter how much you want to withdraw: ");
					int withdraw_amount = input.nextInt();
					if (withdraw_amount > current_balance) {
						System.out.println("Not enough balance");
					} else {
						current_balance = current_balance - withdraw_amount;
						System.out.println("After withdrawing " + withdraw_amount + " Taka your current balance is "
								+ current_balance + " Taka");
					}
					break;
				default:
					System.out.println("Invalid operation");
				}
			} else if (pin_input != PIN) {
				System.out.println("Incorrect PIN");
			} else {
				System.out.println("No operation");
			}
		} catch (Exception e) {
			System.out.println("Enter a valid input please " + e);
		}
	}
}