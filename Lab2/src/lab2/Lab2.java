package lab2;
//You are NOT allowed to add any "import" statement other than 

//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Samuil Mohammad Yazdani
//Yorku Email : samuil@my.yorku.ca
//Date : 2024/01/25
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

/**
 * Objective: practice If statements, nested If statements, Demorgan's Law, Data
 * Comparison
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, double
	 * height, and a boolean athlete and calculates the needed daily calories for
	 * that person as a double.
	 */
	public static double getCalories(int gender, int age, double weight, double height, boolean athlete) {
		if (gender == 1 && weight > 0 && height > 0 && age > 0 && athlete == false) {
			return 10 * weight + 6.25 * height - 5 * age + 5;
		} else {
			if (gender == 2 && weight > 0 && height > 0 && age > 0 && athlete == false) {
				return 10 * weight + 6.25 * height - 5 * age - 161;
			} else {
				if (gender == 1 && weight > 0 && height > 0 && age > 0 && athlete == true) {
					return (10 * weight + 6.25 * height - 5 * age + 5) * (1.2);
				} else {
					if (gender == 2 && weight > 0 && height > 0 && age > 0 && athlete == true) {
						return (10 * weight + 6.25 * height - 5 * age + 5) * (1.15);
					} else {
						return -1.0;
					}
				}

			}
		}

	}

	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
		if (0 <= income && income <= 7150) {
			return (income) * (0.1);
		} else {
			if (7150 < income && income <= 29050) {
				return (income - 7150) * (0.15) + 715;
			} else {
				if (29050 < income && income <= 70350) {
					return (income - 29050) * (0.25) + 4000;
				} else {
					if (70350 < income) {
						return (income - 70350) * (0.28) + 14325;
					} else {
						return -1.0;
					}
				}
			}
		}
	}

	/**
	 * Takes a date as three integers:day, month, and year. The method returns a
	 * true if he date is valid and false otherwise. The method checks if the month
	 * is valid, and the year is after the year 1000. It checks if the day is valid
	 * according to the month. If the month is february, it checks if the year is a
	 * leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		boolean monthValid = month <= 12 && 1 <= month;
		boolean yearValid = 1000 <= year;
		boolean isLeapyear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		int daysInMonth;

		if (isLeapyear == true && month == 2 && day <= 29 && 1 <= day) {
			daysInMonth = 1;
		} else if (isLeapyear == false && month == 2 && day <= 28 && 1 <= day) {
			daysInMonth = 1;
		} else if ((month <= 8 && month != 2 && month % 2 == 0 && day <= 30 && 1 <= day)
				|| (month > 8 && month != 2 && month % 2 == 1 && day <= 30 && 1 <= day)
				|| (month <= 8 && month != 2 && month % 2 == 1 && day <= 31 && 1 <= day)
				|| (month > 8 && month != 2 && month % 2 == 0 && day <= 31 && 1 <= day)) {
			daysInMonth = 1;
		} else {
			daysInMonth = 0;
		}
		if (monthValid == true && yearValid == true && daysInMonth == 1) {
			return true;
		} else {
			return false;
		}
	}

}
