/*
5. Take 5 numbers from users in an array. Then find out the average number, how many even 
   and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().
*/

package arrays_and_functions;

import java.util.Scanner;

public class AverageEvenOdd {

	public static double average(int arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double average = (sum / 5);
		return average;
	}

	public static int countEvenNumbers(int arr[]) {
		int countEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			}
		}
		return countEven;
	}

	public static int countOddNumbers(int arr[]) {
		int countOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				countOdd++;
			}
		}
		return countOdd;
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int arr[] = new int[5];
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter array element: ");
				arr[i] = input.nextInt();
			}
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("Average: " + average(arr));
			System.out.println("Number of Even numbers: " + countEvenNumbers(arr));
			System.out.println("Number of Odd numbers: " + countOddNumbers(arr));
		} catch (Exception e) {
			System.out.println("Caught the exception " + e);
			;
		}
	}
}