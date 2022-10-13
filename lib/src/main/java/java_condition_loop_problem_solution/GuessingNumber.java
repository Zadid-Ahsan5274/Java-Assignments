/*
8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with
   any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this
   for 10 times and count the total points user achieved at the end of 10 cycle.

   To help you understand the problem, here is the explanation.
   In the first cycle, generated random numbers are 3, 19. (This generated numbers will not be shown to anyone)
   User inputs 4
   He does not get any point.
   In the second cycle, generated random numbers are 15, 7. (This generated numbers will not be shown to anyone)
   User inputs 7
   User gets 1 point.
   This process will be continued for 10 times. And finally, the total points are achieved by the user will be printed, like
   Your total point is 7!
*/

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {

		int min = 0;
		int max = 20;
		int player_point = 0;

		try {
			for (int i = 1; i <= 10; i++) {
				int generatedRandomNumber1 = (int) (((Math.random() * (max - min) + min)));
				int generatedRandomNumber2 = (int) (((Math.random() * (max - min) + min)));
				System.out.println("2 random numbers are generated!");
				System.out.print("Please input your guess: ");
				Scanner input = new Scanner(System.in);
				int userGuessedNumber = input.nextInt();
				if (userGuessedNumber == generatedRandomNumber1 || userGuessedNumber == generatedRandomNumber2) {
					System.out.println("Correct guess");
					player_point++;
				} else if (userGuessedNumber < 0 || userGuessedNumber > 20) {
					System.out.println("Please enter a positive number between 0 to 20");
				} else {
					System.out.println("Sorry wrong guess");
				}
			}
			System.out.println("Your total point is: " + player_point + "!");
		} catch (Exception e) {
			System.out.println("Please enter an integer next time!!! " + e);
		}
	}
}