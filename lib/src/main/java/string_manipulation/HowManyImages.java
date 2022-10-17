/*
 * 7. Find out how many images are in the given array:
 * Input:
 * ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
   Output: 3
 */

package string_manipulation;

public class HowManyImages {

    public static void main(String[] args) {

        String filesList[] = { "photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg" };
        String extensionList[] = new String[filesList.length];
        int count = 0;
        for (int i = 0; i < filesList.length; i++) {
            for (int j = 0; j < extensionList.length; j++) {
                extensionList[j] = String.valueOf(filesList[i].split("."));
                System.out.println(extensionList[j]);
                if (extensionList[j] == ".jpg" || extensionList[j] == ".png") {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
