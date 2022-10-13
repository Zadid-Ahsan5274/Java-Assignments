// 6. Write a program to find the factorial of a given number.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

	public static void main(String[] args) {
		try {
			Scanner user_input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			int number = user_input.nextInt();
			System.out.println("Factorial of " + number + " is " + factorial(number));
		} catch (Exception e) {
			System.out.println("Please enter an integer next time " + e);
		}
	}
}