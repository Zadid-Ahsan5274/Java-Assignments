/*
7. Write a program to print prime numbers from 2 to n.

Input:
12

Output:
2
3
5
7
11
 */

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a limit: ");
			int N = input.nextInt();
			for (int i = 2; i <= N; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter an integer " + e);
		}

	}
}