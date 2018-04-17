package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalCostOfferTest {

	@Test
	public void test1() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Orange","Orange"}; 
		double result = checkOut.totalCostOffer(scannedItems);
		assertEquals(1.1, result, 0.0);
	}
	
	@Test
	public void test2() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Orange","Apple","Orange"}; 
		double result = checkOut.totalCostOffer(scannedItems);
		assertEquals(1.7, result, 0.0);
	}
	
	@Test
	public void test3() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Apple","Orange","Orange","Apple","Orange"}; 
		double result = checkOut.totalCostOffer(scannedItems);
		assertEquals(1.7, result, 0.0);
	}
	
	@Test
	public void test4() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Orange","Orange","Orange","Orange"}; 
		double result = checkOut.totalCostOffer(scannedItems);
		assertEquals(1.6, result, 0.0);
	}

	@Test
	public void test5() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","qwer124","Orange","Orange","Orange"}; 
		double result = checkOut.totalCostOffer(scannedItems);
		assertEquals(1.35, result, 0.0);
	}
}
