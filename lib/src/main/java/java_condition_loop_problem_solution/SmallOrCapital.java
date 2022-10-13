// 1. Write a program to check if inputted letter is small or capital.

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class SmallOrCapital {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a character: ");
			char ch = input.next().charAt(0);
			if (ch >= 65 && ch <= 90) {
				System.out.println(ch + " is a capital letter");
			} else if (ch >= 97 && ch <= 122) {
				System.out.println(ch + " is a small letter");
			} else {
				System.out.println("Please enter an uppercase or lowercase character");
			}
		} catch (Exception e) {
			System.out.println("Please enter a character " + e);
		}
	}
}
