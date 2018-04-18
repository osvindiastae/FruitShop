package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalCostTest {

	@Test
	public void test1() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Apple"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(2.05, result, 0.0);
	}

	@Test
	public void test2() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Apple", "apple", "orange"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(2.9, result, 0.0);
	}
	
	@Test
	public void test3() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"grape","Apple","Orange","mango", "qwer123"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(0.85, result, 0.0);
	}
	
	@Test
	public void test4() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"Apple","Apple","Orange","Apple"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(2.05, result, 0.0);
	}
	
	@Test
	public void test5() {
		Checkout checkOut = new Checkout();
		String[] scannedItems = {"qwer543","Banana","Peach","Apple"}; 
		double result = checkOut.totalCost(scannedItems);
		assertEquals(0.6, result, 0.0);
	}
}
