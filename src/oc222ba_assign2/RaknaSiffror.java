/**
 * 
 */
package oc222ba_assign2;

import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class RaknaSiffror {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a positive integer: ");
		
		int number = scan.nextInt();
		scan.close();
		String num = "" + number;
		
		int zero = 0;
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < num.length(); i++) {
			int n = Character.getNumericValue(num.charAt(i));
			if (n == 0)
				zero += 1;
			else if (n%2 == 0)
				even += 1;
			else
				odd += 1;
		}
		
		System.out.println("Zeros: " + zero + "\n" + "Odd: " + odd + "\n" + "Even: " + even);

	}

}
