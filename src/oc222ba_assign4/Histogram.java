/**
 * 
 */
package oc222ba_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class Histogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String path = args[0];

		int total = 0;
		int others = 0;
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		
		try {
			File file = new File (path);
			Scanner scan = new Scanner(file);
			
			while(scan.hasNext()) {
				int number = scan.nextInt();
				if (number > 0 && number < 101) {
					total += 1;
					if (number <= 10) {
						zero += 1;
					}
					if (number > 10 && number <= 20) {
						one += 1;
					}
					if (number > 20 && number <= 30) {
						two += 1;
					}
					if (number > 30 && number <= 40) {
						three += 1;
					}
					if (number > 40 && number <= 50) {
						four += 1;
					}
					if (number > 50 && number <= 60) {
						five += 1;
					}
					if (number > 60 && number <= 70) {
						six += 1;
					}
					if (number > 70 && number <= 80) {
						seven += 1;
					}
					if (number > 80 && number <= 90) {
						eight += 1;
					}
					if (number > 90 && number < 101){
						nine += 1;
					}
				}
				else 
					others += 1;
			}
			scan.close();
		} 
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		
		System.out.println("Reading from: " + path);
		System.out.println("Number of integers in the interval [1,100]: " + total);
		System.out.println("Others: " + others);
		System.out.println("Histogram");
		
		System.out.print("  1  - 10  | ");
		for (int i = 0; i < zero; i++)
			System.out.print("*");
		
		System.out.println();

		System.out.print("  11 - 20  | ");
		for (int i = 0; i < one; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  21 - 30  | ");
		for (int i = 0; i < two; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  31 - 40  | ");
		for (int i = 0; i < three; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  41 - 50  | ");
		for (int i = 0; i < four; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  51 - 60  | ");
		for (int i = 0; i < five; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  61 - 70  | ");
		for (int i = 0; i < six; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  71 - 80  | ");
		for (int i = 0; i < seven; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  81 - 90  | ");
		for (int i = 0; i < eight; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("  91 - 100 | ");
		for (int i = 0; i < nine; i++)
			System.out.print("*");


		
	}

}
