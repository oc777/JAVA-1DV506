/**
 * 
 */
package oc222ba_assign2;

import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide text to test: ");
		String text = scan.nextLine();
		scan.close();
		
		String sortedText = "";
		// sort string from non alphabetical characters and set it to lower case
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i)) == true) {
				sortedText += Character.toLowerCase(text.charAt(i));
			}
		}
		
		// check if string is palindrome
		int l = sortedText.length();
		boolean isPalindrome = true;
		for (int i = 0; i < l/2; i++) {
			if (sortedText.charAt(i) != sortedText.charAt(l -1 -i)) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println((isPalindrome) ? "It is a palindrome.": "It is not a palindrome.");
		
		/* OR...
		if (isPalindrome == true)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		*/
	}

}
