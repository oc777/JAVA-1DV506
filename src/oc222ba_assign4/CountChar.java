/**
 * 
 */
package oc222ba_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class CountChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int upperCase = 0;
		int lowerCase = 0;
		int whitespace = 0;
		int other = 0;
		
		try {
			File file = new File("/Users/olgachristensen/desktop/javatxt/HistoryOfProgramming.txt");

			Scanner scan = new Scanner(file);
			
			while(scan.hasNext()) {
				String text = scan.nextLine();
				other += text.length();
				
				for (int i = 0; i < text.length(); i++) {
					if (Character.isUpperCase(text.charAt(i))) {
						upperCase ++;
						other --;
					}
					if (Character.isLowerCase(text.charAt(i))) {
						lowerCase ++;
						other --;
					}
					if (Character.isWhitespace(text.charAt(i))) {
						whitespace ++;
						other --;
					}
					
				}
				whitespace ++;
			}
			
			scan.close();
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		System.out.println("Number of upper case letters: " + upperCase);
		System.out.println("Number of lower case letters: " + lowerCase);
		System.out.println("Number of \"whitespaces\": " + whitespace);
		System.out.println("Number of others: " + other);

	}

}

/* 
Number of upper case letters: 86
Number of lower case letters: 3715
Number of "whitespaces": 715
Number of others: 152
 */
