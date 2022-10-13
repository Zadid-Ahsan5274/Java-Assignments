/*
 7. Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]
   Output: 
     2
     3
     5
 */

package arrays_and_functions;

public class FindDuplicateElement {

	public static void main(String[] args) {
		try {
			int[] myArray = { 1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5 };
			int count = 0;
			for (int i = 0; i < myArray.length; i++) {
				for (int j = i + 1; j < myArray.length; j++) {
					if (myArray[i] == myArray[j]) {
						count++;
						if (count > 2)
							System.out.println(myArray[i]);
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Caught the exception " + e);
		}
	}

}