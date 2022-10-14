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
				System.out.print("Press \"Y\" or \"y\" or \"q\"to continue: ");
				choice = user_input.next().charAt(0);
				if (choice != 'q') {
					System.out.print("Enter a number: ");
					int number = user_input.nextInt();
					sum = sum + number;
				} else if (choice == 'q') {
					System.out.println("You have enetered " + choice + ". Exiting the code");
					break;
				}
			}
			System.out.println("sum = " + sum);
		} catch (Exception e) {
			System.out.println("Please enter a number : " + e);
		}

	}
}
