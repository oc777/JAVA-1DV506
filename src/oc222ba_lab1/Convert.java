/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Temperature in F: ");
		double f = scan.nextDouble();
		double c = (f - 32)*5/9;
		
		DecimalFormat t = new DecimalFormat("0.#");
		String str = t.format(c);
		
		System.out.print("Temperature in C is: " + str);
		
		scan.close();

	}

}
