/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a number of seconds: ");
		int sec = scan.nextInt();
		
		int h = sec/3600;
		int m = sec%3600/60;
		int s = sec%3600%60;
		
		System.out.print("This corresponds to: " + h + " hours, " + m + 
				" minutes and " + s + " seconds.");
		
		scan.close();

	}

}
