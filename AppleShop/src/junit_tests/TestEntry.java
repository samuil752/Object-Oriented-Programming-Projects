package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.*;

public class TestEntry {

//fail("Not yet implemented"); this can be useful when dealing with exceptions.
	@Test
	public void test_entry_1() {
		Product p = new Product("iPad Pro 12.9", 1709.00);
		p.setFinish("Space Grey");
		p.setStorage(1000);
		p.setHasCellularConnectivity(true);
		p.setDiscountValue(220.0);
		
		
		Entry e = new Entry("F9DN4NKQN4", p);
		assertEquals(e.getSerialNumber(), ("F9DN4NKQN4"));
		assertTrue(e.getProduct() == p);
		assertSame(e.getProduct(), p); //checks to determine whether they are they the same product address.
		
		assertEquals("iPad Pro 12.9", e.getProduct().getModel()); //same as bottom line
		assertTrue(e.getProduct().getModel().equals("iPad Pro 12.9"));
	}
	
	

}
