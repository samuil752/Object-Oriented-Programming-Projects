package Lab1;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Samuil Mohammad Yazdani
//Yorku Email : Samuil@my.yorku.ca
//Date : 2004 February 11
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 *
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematical
	 * sequence
	 */
	public static int collatz(int n) {
	if (n>=0) {
		if (n%2==0) {
			return (n/2);
		}
		if (n%2==1){
			return (3*n+1);
		}
		
	}
		return -1;
	}
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		if (gpa>=1.8&&sat>=900) {
			return "Accept";
		}
		if (gpa<1.8&&sat<900) {
			return "ScoresTooLow";
		}
		return "Reject";
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		if (x>0&&y>0) {
			return 1;
		}
		if (x<0&&y>0) {
			return 2;
		}
		if (x<0&&y<0) {
			return 3;
		}
		if (x>0&&y<0) {
			return 4;
		}
		return 0;
	}
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		if (hour1<hour2 || (hour1==hour2 && min1<=min2)) {
			int x = hour1*60 + min1;
			int y = hour2*60 + min2;
			if ((y-x)>=45) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double x;
		if (oldBalance>0) {
			 x = (oldBalance + charges)*1.02;
		} else {
			 x = (oldBalance + charges);
		}
		if (x >= 50 && 300>x) {
			return 50;	
		} else {
			if (x<50) {
				return x;
			} else {
				return 0.2*x;
			}
		}
	}
}
