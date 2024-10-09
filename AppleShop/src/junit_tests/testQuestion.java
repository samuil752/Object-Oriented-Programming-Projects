package junit_tests;
import static org.junit.Assert.*;

import org.junit.Test;

import model.*;


public class testQuestion {
	@Test
	public void test_Question_1() {
		RefurbishedStore rs = new RefurbishedStore();
		for(int i = 1; i < rs.getMaxCapacity(); i++) {
		    /* Product of each entry is expected to be set later. */
		    rs.addEntry(new Entry("sn " + i, null));
		}
		assertEquals(rs.getMaxCapacity() - 1, rs.getNumberOfEntries());
	
		boolean b = false;
		for(int i = 0; i < rs.getPrivateEntriesArray().length; i++) {
		    b = rs.getPrivateEntriesArray()[i] == null;
		}
		assertTrue(b);
	}

}
