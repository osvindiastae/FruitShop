package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalCostTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Apple"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(2.05, result, 0.0);
	}

}
