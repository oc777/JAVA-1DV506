/**
 * 
 */
package oc222ba_assign2;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;
/**
 * @author olgachristensen
 *
 */
public class OmvandOrding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		System.out.println("Enter positive integers. End by giving a negative integer.");
		int n = 1;
		int i = 1;
		
		//save all integers in "data"
		while (n > 0) {
			System.out.print("Integer " + i + ": ");
			n = scan.nextInt();
			data.add(n);
			i++;
		}

		scan.close();
		
		//remove the last negative int
		data.remove(data.size() -1);
		
		//Collections.reverse(data);   OR...
		
		StringBuilder result = new StringBuilder();
		for (int j = data.size()-1; j >= 0; j--) {
			result.append(data.get(j));
			result.append(" ");
		}
		
		
		System.out.println("Number of positive integers: " + data.size());
		System.out.println("In reverse order: " + result);
		
	}

}
