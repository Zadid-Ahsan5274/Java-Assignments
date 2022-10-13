/* 3. Suppose, in a company, here are some employee salaries in an array, 
   [35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary. */

package arrays_and_functions;

import java.util.Arrays;

public class ThirdHighestSalary {

	public static void main(String[] args) {

		try {
			int[] salaries = { 35000, 25000, 28000, 32500, 44000, 32800 };
			Arrays.sort(salaries);
			System.out.println("Third highest salary: " + salaries[2]);
		} catch (Exception e) {
			System.out.println("Caught the exception " + e);
		}

	}

}