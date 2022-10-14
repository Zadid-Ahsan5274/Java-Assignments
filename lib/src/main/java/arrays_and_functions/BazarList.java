/*
 
4. Create your todays bazar list/pocket expenditure which includes the item name and price. 
 Then create a function named searchItem(String item) which will be used to search any item from 
 your HashMap and return the price. If found no item, then print message as "No item found" and 
 create another function named totalSum() which will return total price of items.

*/

package arrays_and_functions;

import java.util.HashMap;

public class BazarList {

	public static HashMap<String, Integer> todaysBazarList = new HashMap<String, Integer>();
	static {
		todaysBazarList.put("Rice", 315);
		todaysBazarList.put("Meat", 300);
		todaysBazarList.put("Potato", 40);
		todaysBazarList.put("Fish", 379);
		todaysBazarList.put("Egg", 140);
		todaysBazarList.put("Lentil", 135);
		todaysBazarList.put("Breads", 70);
		todaysBazarList.put("Onion", 120);
	}

	public static void searchItem(String item) {
		if (todaysBazarList.containsKey(item)) {
			System.out.println("Price of " + item + " is " + todaysBazarList.get(item));
		} else {
			System.out.println("No item found");
		}
	}

	public static int totalSum() {
		int sum = 0;
		for (int value : todaysBazarList.values()) {
			sum = sum + value;
		}
		return sum;
	}

	public static void main(String[] args) {
		searchItem("Lentil");
		System.out.println("Total price of the items: " + totalSum());
	}

}
