// 9. Write a program to sum of user input until users input ‘q’ from keyboard.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class SumOfUserInput {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int sum = 0;
		char choice;
		try {
			while (true) {
				System.out.print("Wish to continue?: ");
				choice = user_input.next().charAt(0);
				if (choice == 'Y' || choice == 'y') {
					System.out.print("Enter a number: ");
					int number = user_input.nextInt();
					sum = sum + number;
				} else if (choice == 'q') {
					break;
				} else {
					System.out.println("Please enter \"Y\" or \"y\" or \"q\" to continue...");
				}
			}
			System.out.println("sum = " + sum);
		} catch (Exception e) {
			System.out.println("Please enter a number : " + e);
		}

	}
}