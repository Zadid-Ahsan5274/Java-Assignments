/*
  1. Extract the transaction ID from the following HTML body

Input:
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>

Output: TXN123456

*/
package string_manipulation;

public class ExtractTransactionID {

    public static void main(String[] args) {
        try {
            String htmlBody = "<html>\r\n" + "<title>Test</title>\r\n" + "<body>\r\n"
                    + "Your trnx is successful. Trnx Id is: TXN123456\r\n" + "</body>\r\n" + "</html>";
            System.out.println("Extracted Transaction ID is: " + htmlBody.substring(74, 85));
        } catch (Exception e) {
            System.out.println("Caught the exception " + e);
        }
    }
}
