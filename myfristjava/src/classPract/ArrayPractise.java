package classPract;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayPractise {
	public static void main(String[] args) {
		// declare and assign values to a1 and a2
		Random r = new Random();
		int[] a1 = new int[5];
		int[] a2 = new int[5];
		for (int i = 0; i < 5; i++) {
			a1[i] = r.nextInt(10);
			a2[i] = r.nextInt(10);
		}
		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2));
		// copy a2 elements to a1 memory location
		for (int i = 0; i < 5; i++) {
			a1[i] = a2[i];
		}
		System.out.println("a1 (a2 copy): " + Arrays.toString(a1));
		// test
		a1[0] = 999;
		System.out.println("\ntest of copy");
		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2) + "\n\n\n");

		// Arrays.equals() method
		boolean x = Arrays.equals(a1, a2);
		System.out.println(x); // false
		a1[0] = a2[0];
		System.out.println("a1: " + Arrays.toString(a1));
		x = Arrays.equals(a2, a1);
		System.out.println(x); // true
		// re-arraging and seeing the method
		int temp = a1[3];
		a1[3] = a1[0];
		a1[0] = temp;
		x = Arrays.equals(a2, a1);
		System.out.println(x + "\n\n\n");

		// Object.compareTo() method and on objects. CompareTo allows us to know greater
		// than and less than as well unlike equals.
		Double x1 = new Double(Math.PI); // reference variable non-primitive data type cannot use == with these.
		Double y = new Double(Math.E);
		System.out.println(x1.compareTo(y)); // +int
		System.out.println(x1.equals(y)); // false - works with strings and other objects but not arrays for arrays use
											// Arrays.equals(a1, a2)
		x1 = new Double(Math.PI);
		y = new Double(Math.PI);
		System.out.println(x1.compareTo(y)); // 0
//		System.out.println(a1.compareTo(a2)); does not work with Arrays
		System.out.println(x1.equals(y)); // true
		System.out.println("\n\n\n");

		// Array practice
		int[][] example = { { 3, 4, 5, 6, 3, 5 }, { 13, 53, 65, 32, 65 }, { 14, 12, 24, 12, 54 },
				{ 123, 413, 135, 653 } };
		int[][] example2 = { { 1 }, { 1 } };
		int[][] example3 = { { -3, 4, 5, 6, 3, 5 }, { 13, 53, 65, 32, 65 }, { 14, 12, 24, 12, 54 },
				{ 123, 413, 135, 653 } };
		System.out.println(maxSum2D(example));
		System.out.println(maxSum2D(example2));
		System.out.println(testPositive2D(example));
		System.out.println(testPositive2D(example3));
		System.out.println(testPositive2D(example2));
		System.out.println(isRect2D(example));
		System.out.println(isRect2D(example2));
		System.out.println(isRect2D(example3));
		System.out.println(triangleArea(1, 1, 30));
	}

	public String endUp(String str) {
		String y = 'A' + "B";
		String x = y + '1';
		return x;

	}

	public static boolean array123(int[] nums) {
		String str = Arrays.toString(nums);
		System.out.println(str);
		return str.contains("1, 2, 3");

	}

	public static int maxSum2D(int[][] a) {
		// Initialize some variables
		int[] sum = new int[a.length];
		int largestSum = 0;
		// make the sum array
		for (int row = 0; row <= a.length - 1; row++) {
			sum[row] = 0;
			for (int col = 0; col <= a[row].length - 1; col++) {
				sum[row] += a[row][col];
			}
		}
		// check the largest element within the array
		for (int i = 0; i <= sum.length - 1; i++) {
			if (i == 0) {
				largestSum = sum[i];
			} else if (largestSum <= sum[i]) {
				largestSum = sum[i];
			}
		}
		// return largest element
		return largestSum;
	}

	public static boolean testPositive2D(int[][] a) {
		boolean positive = true;
		int col = 0;
		for (int row = 0; row <= a.length - 1; row++) {
			while (col <= a[row].length - 1 && positive == true) {
				positive = 0 <= a[row][col];
				col++;
			}
		}
		return positive;
	}

	public static boolean isRect2D(int[][] a) {
		int colLen = 0;
		boolean rectangle = true;
		for (int row = 0; row <= a.length - 1; row++) {
			if (row == 0) {
				colLen = a[row].length;
			} else if (colLen != a[row].length) {
				rectangle = false;
			}
		}
		return rectangle;
	}

	public static double triangleArea(double a, double b, double alpha) {
		return Math.round((1.0 / 2.0 * a * b * Math.sin(alpha * (Math.PI / 180.0))) * 10.0) / 10.0;
	}
}
