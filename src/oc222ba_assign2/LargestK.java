package oc222ba_assign2;
/**
 * 
 */

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;

public class LargestK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Provide a positive integer: ");
		int N = scan.nextInt();
		scan.close();
		int sum = 0;
		int K = 0;
		
		while (sum < N) {
			K += 2;
			sum += K;
		}
		
		K -= 2;
		
		System.out.println("The largest K such that 0+2+4+6+...+K < " + N + " => K=" + K);

	}

}
