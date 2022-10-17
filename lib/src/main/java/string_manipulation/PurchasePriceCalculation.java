/*
 * 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
 * What will be the purchase price?
 */

package string_manipulation;

public class PurchasePriceCalculation {

    public static void main(String[] args) {

        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.";

        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replace("7 ", " ");

        str = str.trim();
        System.out.println(str);
        String arr[] = str.split(" ");
        double laptop_price = Double.parseDouble(arr[0]);
        System.out.println(laptop_price);
        /*double discount = Double.parseDouble(arr[1]);
        System.out.println(discount);*/
       double purchase_price = laptop_price - 7600;
        System.out.println(purchase_price);

    }

}
