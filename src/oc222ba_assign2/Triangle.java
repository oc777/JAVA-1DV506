/**
 * 
 */
package oc222ba_assign2;

/**
 * @author olgachristensen
 *
 */

import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a positive odd integer: ");
		
		int n = scan.nextInt();
		scan.close();
		
		StringBuilder str1 = new StringBuilder("Right-Angled Triangle: \n");
		StringBuilder str2 = new StringBuilder("Isosceles Triangle: \n");
		
		if (n > 0 && n%2 == 1) {
			//Right-Angled Triangle
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n - i; j++) {
					str1.append(" "); 
				}
				for (int k = 1; k <= i; k++) {
					str1.append("*");
				}
				str1.append("\n");
			} System.out.println(str1);
			
			//Isosceles Triangle
			for (int i = 1; i <= n; i+=2) {
				for (int j = 1; j <= (n - i)/2; j++) {
					str2.append(" ");
				}
				for (int k = 1; k <= i; k++) {
					str2.append("*");
				}
				for (int j = 1; j <= (n - i)/2; j++) {
					str2.append(" ");
				}
				str2.append("\n");
			} System.out.print(str2);
		} else {
			System.out.print("Error. You have not provided an odd postive integer.");
		}
		
	}

}
