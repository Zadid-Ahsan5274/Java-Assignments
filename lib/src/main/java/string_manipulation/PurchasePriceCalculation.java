/*
 * 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
 * What will be the purchase price?
 */

package string_manipulation;

public class PurchasePriceCalculation {

    public static void main(String[] args) {

        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.";
        String digits = str.replaceAll("\\D+", " ");
        System.out.println(digits);
        digits = digits.replaceAll(" 7 "," ");
        System.out.println(digits);
        digits = digits.trim();
        System.out.println(digits);
        String[]arr = digits.split(" ");
        double laptop_price = Double.parseDouble(arr[0]);
        double discount_amount = Double.parseDouble(arr[1]);
        double purchase_price = laptop_price - (laptop_price * (discount_amount/100));
        System.out.println("Purchase price is: "+purchase_price);

    }

}
