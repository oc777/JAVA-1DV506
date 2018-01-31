/**
 * 
 */
package oc222ba_assign2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author olgachristensen
 *
 */
public class Frekvenstabell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> roll = new ArrayList<Integer>();
		int n = 6000; //number of rolls
		
		for (int i = 0; i < n; i++) {
			int dice = r.nextInt(6) + 1;
			roll.add(dice);
		}
		
		int one = 0;
		int two = 0;
		int three = 0;
		int foor = 0;
		int five = 0;
		int six = 0;
		
		for (int i = 0; i < n; i++) {
			switch (roll.get(i)) {
			case 1:
				one ++;
				break;
			case 2:
				two ++;
				break;
			case 3:
				three ++;
				break;
			case 4:
				foor ++;
				break;
			case 5:
				five ++;
				break;
			case 6:
				six++;
				break;
			}
			
		}
		
		System.out.println("1: "+one);
		System.out.println("2: "+two);
		System.out.println("3: "+three);
		System.out.println("4: "+foor);
		System.out.println("5: "+five);
		System.out.println("6: "+six);


	}

}
