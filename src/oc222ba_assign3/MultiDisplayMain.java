/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class MultiDisplayMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3);
		md.display();
		
		md.display("Goodbye cruel world!", 2);
		System.out.println("Current Message: " + md.getDisplayMessage());
		
	}

}
