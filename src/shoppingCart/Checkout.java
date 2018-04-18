package shoppingCart;

public class Checkout {
	
	// cost of apples and oranges are declared
	private double appleCost = 0.6;
	private double orangeCost = 0.25;
	
	// calculates price of the total basket with apples and oranges
	// ignores another other scanned items
	public double totalCost(String[] scannedItems) {
		double totalCost = 0.0;
		
		for (String item : scannedItems) {
			item = item.toLowerCase();
			if (item.equals("apple")) {
				totalCost += appleCost;
			} else if (item.equals("orange")) {
				totalCost += orangeCost;
			}
		}
		return totalCost;
	}
	
	// counts the number of instances of apples and oranges
	// calculates price of the total basket with apples on
	// 2 for 1 offer and oranges on 3 for the price of 2 offer
	// ignores any other scanned items
	public double totalCostOffer(String[] scannedItems) {
		double totalCostOffer = 0.0;
		int appleCount = 0;
		int orangeCount = 0;
		
		for (String item : scannedItems) {
			item = item.toLowerCase();
			if (item.equals("apple")) {
				appleCount++;
			} else if (item.equals("orange")) {
				orangeCount++;
			}
		}
		
		if (appleCount > 0) {
			
			totalCostOffer += ((int)(appleCount/2) * appleCost);
			
			if (appleCount % 2 != 0) {
				totalCostOffer += ((appleCount % 2) * appleCost);
			}
		}
		
		if (orangeCount > 0) {
			
			totalCostOffer += (((int)(orangeCount/3) * 2) * orangeCost);
			
			if (orangeCount % 3 != 0) {
				totalCostOffer += ((orangeCount % 3) * orangeCost);
			}
		}
		return totalCostOffer;
	}

}
