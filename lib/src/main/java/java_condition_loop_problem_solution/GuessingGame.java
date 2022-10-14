/*
2. Write a program according to the following output:

********************Welcome to the Guessing Game! ********************
 ********************A number is already generated. ********************
*****To win, you have 5 chances to guess the generated number. *****

Please, enter an Integer value that you can guess, between 1 to 100: 56 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 23 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 10 (User input)
Your input is lower than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 21 (User input)
Your input is higher than the generated number.

Please, enter an Integer value that you can guess, between 1 to 100: 20 (User input)
Great! You have guessed the correct number.

Congratulation!! You win!!

 */
package java_condition_loop_problem_solution;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		try {
			Scanner user_input = new Scanner(System.in);
			System.out.println("********************Welcome to the Guessing Game! ********************");
			int min = 1;
			int max = 100;
			int generatedRandomNumber = (int) ((Math.random() * ((max - min) + min)));
			System.out.println("********************A number is already generated. ********************");
			System.out.println("*****To win, you have 5 chances to guess the generated number. *****");
			int i = 0;
			while (i < 5) {
				System.out.print("Please, enter an Integer value that you can guess, between 1 to 100: ");
				int userGuessedNumber = user_input.nextInt();
				if (userGuessedNumber > generatedRandomNumber) {
					System.out.println("Your input is higher than the generated number.");
				} else if (userGuessedNumber < generatedRandomNumber) {
					System.out.println("Your input is lower than the generated number.");
				} else if (userGuessedNumber == generatedRandomNumber) {
					System.out.println("Great! You have guessed the correct number.");
					System.out.println("Congratulation!! You win!!");
					break;
				} else {
					System.out.println("Do nothing...");
					System.out.println("Sorry, better luck next time");
				}
				i++;
				if (i >= 5) {
					System.out.println("You have incorrect guess for 5 times. Better luck next time!");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Please enter an integer next time..." + e);
		}
	}

}
