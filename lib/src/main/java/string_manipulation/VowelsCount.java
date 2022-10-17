/*
 * 5. Write a program that will count how many vowels in the given string:
 * Input: "roadtosdet"
   Output: 4
 */

package string_manipulation;

import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter something to count vowels: ");
            String line = in.nextLine();
            char[] ch = line.toCharArray();
            int countOfVowels = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'E' || ch[i] == 'e' || ch[i] == 'I' || ch[i] == 'i'
                        || ch[i] == 'O' || ch[i] == 'o' || ch[i] == 'U' || ch[i] == 'u') {
                    countOfVowels++;
                }
            }
            System.out.println("There are " + countOfVowels + " vowels in " + line);
        } catch (Exception e) {
            System.out.println("Please enter a string " + e);
        }
    }

}
