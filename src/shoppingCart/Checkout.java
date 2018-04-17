package shoppingCart;

public class Checkout {
	
	private double appleCost = 0.6;
	private double orangeCost = 0.25;
	
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
			if (appleCount % 2 == 0) {
				totalCostOffer += ((appleCount/2)*appleCost);
			} else {
				totalCostOffer += (((int)(appleCount/2)) * appleCost) + ((appleCount % 2) * appleCost);
			}
		}
		
		if (orangeCount > 0) {
			if (orangeCount % 3 == 0) {
				totalCostOffer += (((int)(orangeCount/3) * 2) * orangeCost);
			} else {
				totalCostOffer += (((int)(orangeCount/3) * 2) * orangeCost) + ((orangeCount % 3) * orangeCost);
			}
		}
		return totalCostOffer;
	}

}
