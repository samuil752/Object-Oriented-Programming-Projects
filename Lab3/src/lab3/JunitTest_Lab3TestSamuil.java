package lab3;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class JunitTest_Lab3TestSamuil {
	public Timeout globalTimeout = Timeout.seconds(1);
	

	
	    @Test
	    public void PrintStars8() {
	        // Test case scenario 1
			String expected = "********\n-*******\n--******\n---*****\n----****\n-----***\n------**\n-------*";
			assertEquals("Failed printStars",expected, Lab3.printStars(8));
	    }

}
