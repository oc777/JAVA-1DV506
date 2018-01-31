/**
 * 
 */
package oc222ba_assign2;

/**
 * @author olgachristensen
 *
 */
public class BytaPlats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };
		//Först skrivs innehållet i arrayen text ut.
		for (char c:text) {
			System.out.print(c);
		}
		
		System.out.println();
		
		//första elementet byter plats med det sista
		int l = text.length;
		for (int i = 0; i < l/2; i++) {
			char x = text[i];
			char y = text[l - 1 - i];
			text[i] = y;
			text[l - 1 - i] = x;
		}
		
		//Sedan skrivs innehållet i arrayen text ut igen.
		for (char c:text) {
			System.out.print(c);
		}

	}

}
