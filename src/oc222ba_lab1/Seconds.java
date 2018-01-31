/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class Seconds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type hours, minutes and seconds: ");
		int sum = 0;
		sum += 3600 * scan.nextInt();
		sum += 60 * scan.nextInt();
		sum += scan.nextInt();
		
		System.out.println("Total time measured in seconds: " + sum);
		scan.close();

	}

}
