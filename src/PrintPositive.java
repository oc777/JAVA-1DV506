/**
 * 
 */


import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class PrintPositive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give n: ");
		int x = scan.nextInt();
		int[] nums = new int [x];
		
		for (int i = 0; i < x; i++) {
			System.out.print("number " + (i+1) + ": ");
			int n = scan.nextInt();
			nums[i] = n;
		}
		
		scan.close();
		
		System.out.print("Positive: ");
		
		for (int n : nums) {
			if (n > 0) 
				System.out.print(n + " ");
		}

	}

}
