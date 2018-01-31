/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class Change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Price: ");
		float price = scan.nextFloat();
		
		System.out.print("Payment: ");
		int payment = scan.nextInt();
		
		float ch = payment - price;
		int change = Math.round(ch);
		
		int x1 = change / 1000;
		int r1 = change - 1000*x1;
		
		int x2 = r1 / 500;
		int r2 = r1 - 500*x2;
		
		int x3 = r2 / 100;
		int r3 = r2 - 100*x3;
		
		int x4 = r3 / 50;
		int r4 = r3 - 50*x4;
		
		int x5 = r4 / 20;
		int r5 = r4 - 20*x5;
		
		int x6 = r5 / 10;
		int r6 = r5 - 10*x6;
		
		int x7 = r6 / 5;
		int r7 = r6 - 5*x7;
		
		
		System.out.println(
				"Change: " + change + "\n" + 
				"1000kr bills: " + x1 + "\n" +
				"500kr bills: " + x2 + "\n" +
				"100kr bills: " + x3 + "\n" +
				"50kr bills: " + x4 + "\n" +
				"20kr bills: " + x5 + "\n" +
				"10kr coins: " + x6 + "\n" +
				"5kr coins: " + x7 + "\n" +
				"1kr coins: " + r7
		);

		scan.close();
	}

}

