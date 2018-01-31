/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class SumOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a three digit number: ");
		
		int num = scan.nextInt();
		
		int n1 = num/100;
		int n2 = num/10%10;
		int n3 = num%100%10;
		int sum = n1 + n2 + n3;
		
		System.out.print("Sum of digits: " + sum);
		
		scan.close();

	}

}
