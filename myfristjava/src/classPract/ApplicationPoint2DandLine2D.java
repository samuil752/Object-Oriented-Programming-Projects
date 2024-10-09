package classPract;

import java.util.Arrays;

//ClientSide

//Application of point2D and line2D

//Variable Of Primitive Or Reference Type
//➤A variable is declared with a type, but if it is not initialized, it is
//implicitly assigned its default value corresponding to its type.
//➤Primitive Type
//	>int i; [0 is implicitly assigned to i]
//	>double d; [0.0 is implicitly assigned to d]
//	>boolean b; [false is implicitly assigned to b]
//➤Reference Type:
//	>String s; [null is implicitly assigned to s] <--((arrays are reference type, the variable is a memory address to the array))
//	>Point2D p1 [null is implicitly assigned to p1] <--((objects are reference type, the variable is a memory address to the object))

public class ApplicationPoint2DandLine2D {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(2, 4);
		Point2D p2 = new Point2D(3, 5);

		// p1.x = 7; Can't do because the fields are private.
		// p1.y = 98; Can't do because the fields are private.

		Line2D line1 = new Line2D(p1, p2);
		System.out.println("line1: " + line1);
		p1.setX(99); // ((At the address of p1 within the memory, value of x of p1 has changed))
		System.out.println("line1: " + line1); // ((line1 uses address of p1 for the output. Output has changed for p1.x
												// (from 2 to 99)))

//		exceptionsPractice(); //will output Arithmetic exception
//		exceptionPractice2(-1); //will output run-time exception and a message ((terminates the program because the exception is not handled))
//		exceptionPractice2(1000.1); //will output run-time exception and a message <- if exception above is handled
//		exceptionPractice2(50); //will output withdrawal successful <-if exception above is handled
		
		//interface application
		System.out.println("\n");
		Vertebrates myPetCat = new Cat("namr");
		System.out.println(myPetCat);
		
		Vertebrates myAni = new Orca();
		System.out.println(myAni);
		
		Vertebrates[] animals = new Vertebrates[2];
		animals[0] = myPetCat;
		animals[1] = myAni;
		System.out.println("\n\n");
		System.out.println(Arrays.toString(animals));
		myAni.changeName("bob");
		System.out.println(Arrays.toString(animals));
		
	}

	// Testing the function
	public static int mulDiff(int x, int y) {
		return x * y - (x + y);
	}

	public static void exceptionsPractice() {
		int x = 0, y = 5;
		try {
			int z = y / x; //1/0 is an arithmetic exception
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception"); //more specific type of exception
		} catch (Exception e) { // less specific
			System.out.println("error messege is: " + e.getMessage());
		} finally { //ALWAYS goes through this block
			System.out.println("\n process complete");
		}
	}

	public static void exceptionPractice2(double withdraw) {
		if (withdraw < 0.0)
			throw new RuntimeException("Cannot withdraw negative amount"); //throw a new exception
		else if (withdraw > 1000.0)
			throw new RuntimeException("Cannot withdraw more than $1K");
		else
			System.out.println("withdrawal succsessful!");
	}

}
