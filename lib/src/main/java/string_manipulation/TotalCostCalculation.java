/*
2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and
   1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
*/

package string_manipulation;


import java.util.Arrays;

public class TotalCostCalculation {
    public static void main(String[] args) {

        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and  1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        String digits = str.replaceAll("\\D+", " ");
        // System.out.println(digits);
        digits = digits.trim();
        // System.out.println(digits);
        String[]arr = digits.split(" ");
        double shirt_price = Double.parseDouble(arr[0]);
        double sharee_price = Double.parseDouble(arr[1]);
        int shirt_quantity = Integer.parseInt(arr[2]);
        int sharee_quantity = Integer.parseInt(arr[3]);
        double discount_amount = Double.parseDouble(arr[4]);
        double total_cost = ((shirt_quantity*shirt_price)+(sharee_quantity*sharee_price))-discount_amount;
        System.out.println("Total cost will be: " +total_cost);


    }

}


