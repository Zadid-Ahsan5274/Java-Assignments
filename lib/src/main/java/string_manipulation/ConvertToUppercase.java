/*
 * 8. Write a program to convert each 1st char to uppercase from a string
 *
 * Input: rahim lives in sylhet
   Output: Rahim Lives in Sylhet
 */

package string_manipulation;

import java.util.Scanner;

public class ConvertToUppercase {

    public static void main(String[] args) {
        try {
            Scanner user_input = new Scanner(System.in);
            System.out.print("Please enter a string: ");
            String str = user_input.nextLine();
            String firstLetter = " ";
            String othersLetter = " ";
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
                othersLetter = words[i].substring(1);
                System.out.println(firstLetter + othersLetter);
            }
        } catch (Exception e) {
            System.out.println("Please enter a line " + e);
        }

    }

}
