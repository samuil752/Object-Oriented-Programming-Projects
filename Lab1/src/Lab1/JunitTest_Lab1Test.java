package Lab1;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
//NO NEED TO SUBMIT THIS FILE

public class JunitTest_Lab1Test {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void testCollatzNeg() {
		int num = Lab1.collatz(-10);
		assertEquals("Failed collatz of -10",-1,num);
	}
	@Test
	public void testCollatzNeg2() {
		int num = Lab1.collatz(-50);
		assertEquals("Failed collatz of -50",-1,num);
	}
	@Test
	public  void testCollatz7() {
		int num = Lab1.collatz(7);
		assertEquals("Failed collatz of 7",22,num);
	}
	@Test
	public void testCollatz22() {
		int num = Lab1.collatz(22);
		assertEquals("Failed collatz of 22",11,num);
	}
	@Test
	public void testCollatz67() {
		int num = Lab1.collatz(67);
		assertEquals("Failed collatz of 67",202,num);
	}
	
	@Test
	public void test_0_1_Collatz() {
		int num = Lab1.collatz(98);
		assertEquals("Failed collatz of 98",49,num);
	}
	
	@Test
	public void test_0_2_Collatz() {
		int num = Lab1.collatz(97);
		assertEquals("Failed collatz of 97",292,num);
	}
	@Test
	public void test_0_3_Collatz() {
		int num = Lab1.collatz(55);
		assertEquals("Failed collatz of 55",166,num);
	}
	
	@Test
	public void testYorkAdmit1() {
		String decision = Lab1.yorkAdmit(1.5,1000);
		assertEquals("Failed yorkAdmit of 1.5 and 1000","Reject",decision);
	}
	@Test
	public void testYorkAdmit2() {
		String decision = Lab1.yorkAdmit(2.3,600);
		assertEquals("Failed yorkAdmit of 2.3 and 600","Reject",decision);
	}
	@Test
	public void testYorkAdmit3() {
		String decision = Lab1.yorkAdmit(2.0,1200);
		assertEquals("Failed yorkAdmit of 2.0 and 1200","Accept",decision);
	}
	@Test
	public void testYorkAdmit4() {
		String decision = Lab1.yorkAdmit(1.4,700);
		assertEquals("Failed yorkAdmit of 1.4 and 700","ScoresTooLow",decision);
		decision = Lab1.yorkAdmit(2.0,1200);
		assertEquals("Failed yorkAdmit of 2.0 and 1200","Accept",decision);
	}
	
	@Test
	public void testYorkAdmit5() {
		String decision = Lab1.yorkAdmit(2.5,1000);
		assertEquals("Failed yorkAdmit of 2.5 and 1000","Accept",decision);
	}
	@Test
	public void testYorkAdmit6() {
		String decision = Lab1.yorkAdmit(2.8,100);
		assertEquals("Failed yorkAdmit of 2.8 and 100","Reject",decision);
		decision = Lab1.yorkAdmit(2.5,1000);
		assertEquals("Failed yorkAdmit of 2.5 and 1000","Accept",decision);
	}
	@Test
	public void testYorkAdmit7() {
		String decision = Lab1.yorkAdmit(1.0,200);
		assertEquals("Failed yorkAdmit of 1.0 and 200","ScoresTooLow",decision);
		decision = Lab1.yorkAdmit(2.8,100);
		assertEquals("Failed yorkAdmit of 2.8 and 100","Reject",decision);
	}
	@Test
	public void testYorkAdmit8() {
		String decision = Lab1.yorkAdmit(1.8,900);
		assertEquals("Failed yorkAdmit of 1.8 and 900","Accept",decision);
	decision = Lab1.yorkAdmit(1.0,200);
		assertEquals("Failed yorkAdmit of 1.0 and 200","ScoresTooLow",decision);
	}
	
	@Test
	public void testYorkAdmit9() {
		String decision = Lab1.yorkAdmit(3.8,800);
		assertEquals("Failed yorkAdmit of 3.8 and 800","Reject",decision);
	 decision = Lab1.yorkAdmit(1.8,900);
		assertEquals("Failed yorkAdmit of 1.8 and 900","Accept",decision);
	}
	
	@Test
	public void testYorkAdmit10() {
		String decision = Lab1.yorkAdmit(2.8,1200);
		assertEquals("Failed yorkAdmit of 2.8 and 1200","Accept",decision);
	 decision = Lab1.yorkAdmit(1.8,900);
		assertEquals("Failed yorkAdmit of 1.8 and 900","Accept",decision);
	}
	
	@Test
	public void testQuadrant0() {
		int qdrt = Lab1.quadrant(0.0, 3.14);
		assertEquals("Failed quadrant of (0.0, 3.14)",0,qdrt);
	}
	@Test
	public void testQuadrant00() {
		int qdrt = Lab1.quadrant(12.4, 0.0);
		assertEquals("Failed quadrant of (12.4, 0.0)",0,qdrt);
	}
	
	@Test
	public void testQuadrant000() {
		int qdrt = Lab1.quadrant(0.0, 0.0);
		assertEquals("Failed quadrant of (0.0, 0.0)",0,qdrt);
	}
	@Test
	public void testQuadrant1() {
		int qdrt = Lab1.quadrant(12.4, 17.8);
		assertEquals("Failed quadrant of (12.4, 17.8)",1,qdrt);
	}
	@Test
	public void testQuadrant2() {
		int qdrt = Lab1.quadrant(-2.3, 3.5);
		assertEquals("Failed quadrant of (-2.3, 3.5)",2,qdrt);
	}
	@Test
	public void testQuadrant21() {
		int qdrt = Lab1.quadrant(-20.3, 30.5);
		assertEquals("Failed quadrant of (-20.3, 30.5)",2,qdrt);
	}
	@Test
	public void testQuadrant3() {
		int qdrt = Lab1.quadrant(-15.2, -3.1);
		assertEquals("Failed quadrant of (-15.2, -3.1)",3,qdrt);
	}
	@Test
	public void testQuadrant31() {
		int qdrt = Lab1.quadrant(-1.2, -0.1);
		assertEquals("Failed quadrant of (-1.2, -0.1)",3,qdrt);
	}
	@Test
	public void testQuadrant4() {
		int qdrt = Lab1.quadrant(4.5, -42.0);
		assertEquals("Failed quadrant of (4.5, -42.0)",4,qdrt);
	}
	@Test
	public void testQuadrant41() {
		int qdrt = Lab1.quadrant(0.5, -1.80);
		assertEquals("Failed quadrant of (0.5, -1.8)",4,qdrt);
	}
	@Test
	public void testEnoughLunchTime1() {
		boolean elt = Lab1.enoughLunchTime (11, 00, 11, 59);
		assertEquals("Failed enoughLunchTime of (11, 00, 11, 59)",true,elt);
	}
	@Test
	public void testEnoughLunchTime2() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 0);
		assertEquals("Failed quadrant of (12, 30, 13, 00)",false,elt);
	}
	@Test
	public void testEnoughLunchTime3() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 15);
		assertEquals("Failed enoughLunchTime of (12, 30, 13, 15)",true,elt);
	}
	@Test
	public void testEnoughLunchTime4() {
		boolean elt = Lab1.enoughLunchTime (14, 20, 17, 2);
		assertEquals("Failed enoughLunchTime of (14, 20, 17, 02)",true,elt);
	}
	@Test
	public void testEnoughLunchTime5() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 9, 30);
		assertEquals("Failed enoughLunchTime of (12, 30, 9, 30)",false,elt);
	}
	@Test
	public void testEnoughLunchTime6() {
		boolean elt = Lab1.enoughLunchTime (12, 0, 11, 55);
		assertEquals("Failed enoughLunchTime of (12, 00, 11, 55))",false,elt);
	}
	@Test
	public void testEnoughLunchTime7() {
		boolean elt = Lab1.enoughLunchTime (11, 00, 11, 50);
		assertEquals("Failed enoughLunchTime of (11, 00, 11, 50)",true,elt);
		 elt = Lab1.enoughLunchTime (11, 00, 11, 30);
		assertEquals("Failed enoughLunchTime of (11, 00, 11, 30)",false,elt);
		 elt = Lab1.enoughLunchTime (20, 00, 20, 30);
			assertEquals("Failed enoughLunchTime of (20, 00, 20, 30)",false,elt);
	}
	@Test
	public void testEnoughLunchTime8() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 0);
		assertEquals("Failed quadrant of (12, 30, 13, 00)",false,elt);
		elt = Lab1.enoughLunchTime (13, 30, 14, 40);
		assertEquals("Failed quadrant of (13, 30, 14, 40)",true,elt);
		elt = Lab1.enoughLunchTime (11, 30, 14, 40);
		assertEquals("Failed quadrant of (11, 30, 14, 40)",true,elt);
	}
	@Test
	public void testEnoughLunchTime9() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 15);
		assertEquals("Failed enoughLunchTime of (12, 30, 13, 15)",true,elt);
		
		elt = Lab1.enoughLunchTime (21, 30, 22, 5);
		assertEquals("Failed enoughLunchTime of (21, 30, 22, 05)",false,elt);
		elt = Lab1.enoughLunchTime (23, 30, 23, 45);
		assertEquals("Failed enoughLunchTime of (23, 30, 23, 45)",false,elt);
	}
	@Test
	public void testEnoughLunchTime10() {
		boolean elt = Lab1.enoughLunchTime (14, 20, 17, 2);
		assertEquals("Failed enoughLunchTime of (14, 20, 17, 02)",true,elt);
		
		elt = Lab1.enoughLunchTime (14, 20, 14, 12);
		assertEquals("Failed enoughLunchTime of (14, 20, 14, 12)",false,elt);
		elt = Lab1.enoughLunchTime (1, 20, 1, 12);
		assertEquals("Failed enoughLunchTime of (1, 20, 1, 12)",false,elt);
	}
	@Test
	public void testEnoughLunchTime11() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 9, 30);
		assertEquals("Failed enoughLunchTime of (12, 30, 9, 30)",false,elt);
		
		elt = Lab1.enoughLunchTime (18, 30, 19, 30);
		assertEquals("Failed enoughLunchTime of (18, 30, 19, 30)",true,elt);
		
		elt = Lab1.enoughLunchTime (18, 30, 18, 30);
		assertEquals("Failed enoughLunchTime of (18, 30, 18, 30)",false,elt);
	}
	@Test
	public void testEnoughLunchTime12() {
		boolean elt = Lab1.enoughLunchTime (12, 0, 11, 55);
		assertEquals("Failed enoughLunchTime of (12, 00, 11, 55))",false,elt);
		elt = Lab1.enoughLunchTime (11, 0, 11, 55);
		assertEquals("Failed enoughLunchTime of (11, 00, 11, 55))",true,elt);
		
		elt = Lab1.enoughLunchTime (9, 0, 11, 55);
		assertEquals("Failed enoughLunchTime of (9, 00, 11, 55))",true,elt);
	}
	
	@Test
	public void testEnoughLunchTimeInvInput() {
		boolean elt = Lab1.enoughLunchTime (24, 0, 11, 60);
		assertEquals("Failed enoughLunchTime of (24, 0, 11, 60))",false,elt);
	}
	@Test
	public void testComputePayment1() {
		double pay = Lab1.computePayment(0.0,40.0);
		assertEquals("Failed computePayment of (0.0,40.0))",40.0,pay,0.0000001);
	}
	@Test
	public void testComputePayment2() {
		double pay = Lab1.computePayment (100.0,55.0);
		assertEquals("Failed computePayment of (100.0,55.0))",50.0,pay,0.0000001);
	}
	@Test
	public void testComputePayment3() {
		double pay = Lab1.computePayment (220.0,345.0);
		assertEquals("Failed computePayment of (220.0,345.0)",115.26,pay,0.0000001);
	}
	@Test
	public void testComputePayment4() {
		double pay = Lab1.computePayment (0.0,400.0);
		assertEquals("Failed computePayment of (0.0,400.0)",80.0,pay,0.0000001);
	}

	@Test
	public void testComputePayment5() {
		double pay = Lab1.computePayment(0.0,50.0);
		assertEquals("Failed computePayment of (0.0,50.0))",50.0,pay,0.0000001);
	}
	@Test
	public void testComputePayment6() {
		double pay = Lab1.computePayment (120.0,65.0);
		assertEquals("Failed computePayment of (120.0,65.0))",50.0,pay,0.0000001);
	}
	@Test
	public void testComputePayment7() {
		double pay = Lab1.computePayment (1220.0,3145.0);
		
		assertEquals("Failed computePayment of (1220.0,3145.0)",890.46,pay,0.0000001);
	}
	@Test
	public void testComputePayment8() {
		double pay = Lab1.computePayment (0.0,1400.0);
		
		assertEquals("Failed computePayment of (0.0,1400.0)",280.0,pay,0.0000001);
	}
	@Test
	public void testComputePayment9() {
		double pay = Lab1.computePayment (10000.0,1400.0);
		
		assertEquals("Failed computePayment of (10000.0,1400.0)",2325.6,pay,0.0000001);
	}
}
