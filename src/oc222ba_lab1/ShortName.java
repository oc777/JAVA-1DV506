/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;
public class ShortName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Your first name: ");
		String fName = scan.nextLine();
		System.out.print("Your last name: ");
		String lName = scan.nextLine();
		String lNameS = "";
		
		String fNameS = fName.charAt(0) + ".";
		if (lName.length() < 4) 
			 lNameS = lName;
		else 
			 lNameS = lName.substring(0, 4);
		
		System.out.print("Short name: " + fNameS + " " + lNameS);
		scan.close();

	}

}

