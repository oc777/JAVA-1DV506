package oc222ba_assign2;
/**
 * 
 */

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;

public class Backwards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Provide text: ");
		
		String text = scan.nextLine();
		scan.close();
		StringBuilder result = new StringBuilder();
		
		for (int i=text.length()-1; i>=0; i--) {
			result.append(text.charAt(i));
		}
		
		System.out.println("Backwards: " + result.toString());
	}

}
