package Midterm;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {
	
	Inventory instance;
	
	@BeforeEach
	void setUp() throws Exception {
		instance = new Inventory();
	}
	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

	@Test
	void testGetWeight() {
		assertEquals(0, instance.getWeight(), "Weight not the same");
	}
	
	@Test
	void testAddItemUnder250() {
		ArrayList<InventoryItem> expected = new ArrayList<InventoryItem>();
		InventoryItem thing;
		thing = new InventoryItem("itemtype", 100, "itemname", 5);
		expected.add(thing);
		assertEquals(expected, instance.addItemToInventory(thing));
		
	}
	
	@Test
	void testAddItemOver250() {
		ArrayList<InventoryItem> expected = new ArrayList<InventoryItem>();
		InventoryItem thing;
		thing = new InventoryItem("itemtype", 251, "itemname", 5);
		assertEquals(expected, instance.addItemToInventory(thing));
	}

}
