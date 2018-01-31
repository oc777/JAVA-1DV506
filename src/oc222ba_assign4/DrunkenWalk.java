/**
 * 
 */
package oc222ba_assign4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class DrunkenWalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int size = scan.nextInt();
		
		System.out.print("Enter the number of steps: ");
		int max = scan.nextInt();
		
		System.out.print("Enter the number of walks: ");
		int n = scan.nextInt();
		
		scan.close();
		
		int splash = 0;
		
		for (int i = 0; i < n; i++) {
			RandomWalk rw = new RandomWalk(max, size);
			//System.out.println("Walk " + (i + 1));    // test
			rw.walk();
			
			if (rw.getStepsTaken() < max)
				splash++;
			
		}
		
		double stats = (double) splash / n * 100;
		
		DecimalFormat xx = new DecimalFormat("0.##");
		String s = xx.format(stats);
		
		System.out.println("Out of " + n + " drunk people, " + splash + " (" + s + "%) " + " fell into the water.");

	}

}
