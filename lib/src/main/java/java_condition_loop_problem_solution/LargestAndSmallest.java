/*
10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and
    smallest numbers user entered.
       Input:
        23
        54
        12
        21
        67
        98
        q
       Output:
        The largest number is: 98
        The smallest number is: 12
*/

package java_condition_loop_problem_solution;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {

//        System.out.println("Enter the number -999  to exit");
		// number = input.nextInt();
//        if(number != -999){
//            largest = number;
//        }
//        if(number !=-999){
//            smallest = number;
//        }
//        while(number != -999){
//            if(number < smallest){
//                smallest = number;
//            }
//            if(number > largest){
//                largest = number;
//            }
//            System.out.println("Enter the number -999  to exit");
//            number = input.nextInt();
//        }
		try {
			Scanner console = new Scanner(System.in);

			int number;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			char choice;

			do {
				System.out.print("Enter the number ");
				number = console.nextInt();

				if (number > max) {
					max = number;
				}

				if (number < min) {
					min = number;
				}

				System.out.print("Do you want to continue y/n? ");
				choice = console.next().charAt(0);

			} while (choice == 'y' || choice == 'Y');
			System.out.println("Largest number: " + max);
			System.out.println("Smallest number: " + min);
		} catch (Exception e) {
			System.out.println("Please enter valid input: " + e);
		}
	}
}
