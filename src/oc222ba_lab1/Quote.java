/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class Quote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type some text:");
		String text = scan.nextLine();
		System.out.println("Quote: \"" + text + "\"");
		scan.close();
	}

}
