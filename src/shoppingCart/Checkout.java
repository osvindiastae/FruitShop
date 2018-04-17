package shoppingCart;

public class Checkout {

	public double totalCost(String[] scannedItems) {
		double totalCost = 0.0;
		
		for (String item : scannedItems) {
			item = item.toLowerCase();
			System.out.println(item);
			if (item.equals("apple")) {
				totalCost += 0.60;
			} else if (item.equals("orange")) {
				totalCost += 0.25;
			}
		}
		System.out.println(totalCost);
		return totalCost;
	}

}
