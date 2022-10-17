/*
 * 4. Write a program that will give following output:
 * Input: Chattogram
   Output: C8M
 */

package string_manipulation;

import java.util.Scanner;

public class MiddleCharsCount {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter a word: ");
            String initialWord = in.nextLine();
            String finalWord = "";
            char ch[] = initialWord.toCharArray();
            int countOfMidChars = 0;
            for (int i = 1; i < ch.length - 1; i++) {
                finalWord = finalWord + ch[i];
            }
            char[] anotherChar = finalWord.toCharArray();
            for (int i = 0; i < anotherChar.length; i++) {
                countOfMidChars = countOfMidChars + 1;
            }
            // System.out.println(finalWord);
            // System.out.println(countOfMidChars);
            int length = initialWord.length();
            char first = initialWord.charAt(0);
            char last = initialWord.charAt(length - 1);
            String finalLine = Character.toString(first) + Integer.toString(countOfMidChars)
                    + Character.toString(last).toUpperCase();
            System.out.println(finalLine);
        } catch (Exception e) {
            System.out.println("Caught the exception " + e);
        }
    }

}
