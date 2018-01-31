/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class SumOfThree2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a three digit number: ");
		
		int num = scan.nextInt();
		
		String str = "" + num;
		
		int one = Character.getNumericValue(str.charAt(0));
		int two = Character.getNumericValue(str.charAt(1));
		int thr = Character.getNumericValue(str.charAt(2));
		
		int sum = one + two + thr;
		
		System.out.print(sum);
		
		scan.close();
	}

}
