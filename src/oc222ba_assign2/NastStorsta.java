/**
 * 
 */
package oc222ba_assign2;

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;

public class NastStorsta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 10;
		int max;
		int nextMax;
		
		System.out.print("Provide " +n+ " integers: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if (x < y){
			max = y;
			nextMax = x;
		} 
		else {
			max = x;
			nextMax = y;
		}
		
		for (int i = 0; i < n-2; i++) {
			int z = scan.nextInt();
			
			if (z > max){
				nextMax = max;
				max = z;	
			} 
			if (z > nextMax && z < max) {
				nextMax = z;
			}	
		}

		System.out.print("The second largest is: " + nextMax);
		scan.close();
	}

}
