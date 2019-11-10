package Midterm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomNumberAdderTest {
	
	RandomNumberAdder instance;
	
	@BeforeEach
	void setUp() throws Exception {
		instance = new RandomNumberAdder();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}
	
	@Test
	void testInitial() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i = 0;
		assertEquals(i, instance.sum);
		assertEquals(a, instance.numList);	
	}
	
	@Test
	void testNumListSize() {
		instance.addRandomNumbers(10, 100);
		int listSize = 10;
		assertEquals(listSize, instance.numList.size());
	}
	
	@Test
	void testSum() {
		instance.addRandomNumbers(10, 100);
		assertEquals(0, instance.sum);
		instance.sumRandomNumbers();
		assertNotEquals(0, instance.sum);
	}

}
