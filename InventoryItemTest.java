package Midterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class InventoryItemTest {
	
	InventoryItem instance;
	
	@BeforeEach
	void setUp() throws Exception {
		instance = new InventoryItem("itemtype", 100, "itemname", 5);
	}
	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}
	
	@Test
	void testGetName() {
		String expected = "itemname";
		assertEquals(expected, instance.getName());
	}
	
	@Test
	void testGetType() {
		String expected = "itemtype";
		assertEquals(expected, instance.getType());
	}
	
	@Test
	void testGetWeight() {
		int expected = 100;
		assertEquals(expected, instance.getWeight());
	}
	
	@Test
	void testGetCount() {
		int expected = 5;
		assertEquals(expected, instance.getCount());
	}


}
