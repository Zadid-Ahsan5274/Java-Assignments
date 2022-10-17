/*
6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim live in Rangpur
Output: Ratul and Fahim lives in Rangpur
*/
package string_manipulation;

public class ReplaceLetter {

    public static void main(String[] args) {

        try {
            String initialString = "Ratul and Rahim live in Rangpur";
            String replacedString = initialString.replace("Rahim", "Fahim");
            System.out.println(replacedString);
        } catch (Exception e) {
            System.out.println("Caught the exception " + e);
        }
    }

}
