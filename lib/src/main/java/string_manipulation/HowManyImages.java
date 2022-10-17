/*
 * 7. Find out how many images are in the given array:
 * Input:
 * ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
   Output: 3
 */

package string_manipulation;
public class HowManyImages {

    public static void main(String[] args) {

        String filesList[] = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        String extensionList[] = new String[filesList.length];
        int countOfImages = 0;
        for (int i = 0; i < filesList.length; i++) {
            if (i == 0 || i == 3 || i == 6) {
                extensionList[i] = filesList[i].substring(6, 10).toString();
            } else if (i == 1 || i == 2 || i == 4) {
                extensionList[i] = filesList[i].substring(4, 8).toString();
            } else if (i == 5) {
                extensionList[i] = filesList[i].substring(8, 12).toString();
            }
            //System.out.println(extensionList[i]);

        }
        for(int i = 0; i < extensionList.length;i++){
            if (extensionList[i].toString().equals(".jpg") || extensionList[i].toString().equals(".png")) {
                countOfImages++;
            }
        }

        System.out.println("Number of images: "+countOfImages);


    }

}
