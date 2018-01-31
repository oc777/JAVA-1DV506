/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */
import java.util.Random;

public class PhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random r = new Random();
		
		int x = r.nextInt(900) + 100;
		int z = r.nextInt(9) + 1;
		int y = r.nextInt(90000) + 10000;
		
		System.out.print("Phone number: " + 0 + x + "-" + z + y);
		
		/*
		System.out.print("Phone number: " + 0 + 
				r.nextInt(10) + 
				r.nextInt(10) + 
				r.nextInt(10) + "-" + 
				(r.nextInt(9) + 1) + 
				r.nextInt(10) + 
				r.nextInt(10) + 
				r.nextInt(10) +
				r.nextInt(10) + 
				r.nextInt(10));
				*/
	}

}
