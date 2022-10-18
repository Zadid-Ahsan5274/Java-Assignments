/*

1. Take input from a user and check if the number exists in the array.
Let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3

Input: 9
Output: Found no element

*/

package arrays_and_functions;

import java.util.Scanner;

public class ElementExistsOrNot {

	public static void main(String[] args) {
		try {
			int[] myArray = { 1, 3, 5, 7, 2, 4, 6, 8 };
			Scanner user_input = new Scanner(System.in);
			System.out.print("Enter element to check: ");
			int number = user_input.nextInt();
			boolean flag = false;
			int index = 0;
			for (int i = 0; i < myArray.length; i++) {
				if( myArray[i] != number){
					flag = false;
					//continue;
				} else if(myArray[i] == number){
					flag = true;
					index = i;
					break;
				}

			}
			if (flag == true) {
				System.out.println("Found element at position " + index);
			}
			else if (flag == false) {
				System.out.println("Found no element");
			}
		} catch (Exception e) {
			System.out.println("Caught the exception " + e);
		}
	}

}
