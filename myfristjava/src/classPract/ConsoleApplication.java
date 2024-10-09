package classPract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * console application
 */

public class ConsoleApplication {

	public static void main(String[] args) {
//		Scanner Input = new Scanner(System.in);
//		int storeInt = Input.nextInt();
//		System.out.println(classPract.RandomStaticMethods.square(storeInt));
//		System.out.println("abcdefg");
//		Input.close();
		
//		//implementation of ArrayList<String>
//		List<String> listString = new ArrayList<String>();
//		listString.add("A");
//		listString.add("B");
//		listString.add("C");
//		TestArrayList.printListElements(listString);
//		List<Double> listDouble = new ArrayList<Double>();
//		listDouble.add(0.123);
//		listDouble.add(324.4);
//		listDouble.add(23.45);
//		TestArrayList.printListElements(listDouble);
//		Set<Character> setChar = new LinkedHashSet<Character>();
//		setChar.add('A');
//		setChar.add('O');
//		TestArrayList.printListElements(setChar);
//		
//		//complexity
//		String testString = "In the bustling cityscape, where skyscrapers kiss the clouds and neon signs dazzle % with their vibrant hues, life pulsates like a symphony of endless possibilities. Amidst the cacophony of car horns and the relentless shuffle of pedestrians, there exists a serene oasis—a hidden café nestled between the cracks of anonymity. Here, time slows to a languid pace, punctuated by the aroma of freshly brewed coffee and the gentle clinking of porcelain cups. It's a place where dreams mingle with reality, where the mundane % transcends into the extraordinary. Here, in this corner of the world, amidst the chaos and the calm, stories are born, conversations bloom like wildflowers, and the whispers of the city weave a tapestry of life's myriad hues.";
//		long startTime;long endTime;long elapsedTime;
//		startTime = System.currentTimeMillis();
//		WordSmith.wordFrequency(testString);
//		endTime = System.currentTimeMillis();
//		elapsedTime = endTime -startTime;
//		System.out.println(String.format("elapsed time: %dms", elapsedTime));
//		
//		startTime = System.currentTimeMillis();
//		WordSmith.longestWord(testString);
//		endTime = System.currentTimeMillis();
//		elapsedTime = endTime -startTime;
//		System.out.println(String.format("elapsed time: %dms", elapsedTime));
		
		ConsoleApplication.question1();
	}
     public static void question1() {
         int result = 0;
         for (int i = 1; i <= 3; i++) {
             for (int j = 1; j <= 3; j++) {
                 if (i == j) {
                     result += i * j;
                 } else {
                     result += i + j;
                 }
             }
         }
         System.out.println("Result: " + result);
     }

}
