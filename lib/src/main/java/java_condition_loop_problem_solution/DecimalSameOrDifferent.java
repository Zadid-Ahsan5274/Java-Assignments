/*

3. Input 2 decimal numbers. Check if they are both same or different up to two decimal places.

Input: 120.546 & 120.241
Output: The numbers are not same.

Input: 54.6987 & 54.6949
Output: The numbers are same.

 */
package java_condition_loop_problem_solution;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalSameOrDifferent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter first decimal number: ");
			double d1 = input.nextDouble();
			System.out.print("Enter second decimal number: ");
			double d2 = input.nextDouble();
			DecimalFormat df = new DecimalFormat("#.##");
			df.setRoundingMode(RoundingMode.CEILING);

			if ((df.format(d1)).equals(df.format(d2))) {
				System.out.println("The numbers are same.");
			} else {
				System.out.println("The numbers are not same.");
			}
		} catch (Exception e) {
			System.out.println("Please enter a decimal number " + e);
		}
	}

}