/**
 * 
 */
package oc222ba_assign2;

/**
 * @author olgachristensen
 *
 */
public class TartLjus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bd = 0;
		int boxes = 0;
		int candles = 0;
		
		for (int i = 0; i < 100; i++) {
			bd++;
			if (bd > candles) {
				boxes++;
				candles += 24;
				System.out.println("Before birthday " + bd + " buy " + boxes + " box(es).");
			}
			
		}
		
		System.out.println("Total number of boxes: " + boxes);
		System.out.println("Remaining candels: " + (candles - 100));

	}

}
