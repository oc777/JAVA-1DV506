/**
 * 
 */
package oc222ba_assign2;

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;

public class CountA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Provide a text: ");
		
		String text = scan.nextLine();
		scan.close();
		int countS = 0;
		int countL = 0;
		
		for (int i=0; i<text.length(); i++) {
			if (text.charAt(i) == 'a')
				countS++;
			else if (text.charAt(i) == 'A')
				countL++;	
		}
		
		System.out.println("Number of 'a': " + countS);
		System.out.println("Number of 'A': " + countL);		
	}

}
