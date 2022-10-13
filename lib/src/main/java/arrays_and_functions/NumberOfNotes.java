/*
2. Input an amount from the user and find out the number of notes from input amount 
   in given array [1000,500,100,50,20,10,5,2,1].
   Input: 1256

   Output: 
    1000 1
    100 2
    50 1
    2 3
 */

package arrays_and_functions;

import java.util.Scanner;

public class NumberOfNotes {

	public static void countCurrency(int amount) {
		int notes[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int noteCounter[] = new int[9];
		for (int i = 0; i < 9; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
		System.out.println("Currency count: ");
		for (int i = 0; i < 9; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter an amount: ");
			int amount = input.nextInt();
			countCurrency(amount);
		} catch (Exception e) {
			System.out.println("Please enter valid amount " + e);
		}
	}
}