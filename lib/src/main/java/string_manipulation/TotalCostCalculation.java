/*
2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and
   1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
*/

package string_manipulation;

public class TotalCostCalculation {

    public static void main(String[] args) {

        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. "
                + "If you buy 2 shirt and  1 sharee, then 400 tk will be discounted. "
                + "After your purchase what will be your total cost?";
        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll("                ", " ");
        System.out.println(str);
        String[] arr = str.split(" ");
        double shirt_price = Double.parseDouble(arr[0]);
        System.out.println(arr[0]);
        double sharee_price = Double.parseDouble(arr[1]);
        System.out.println(arr[1]);
    }

}
