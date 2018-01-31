/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class MultiDisplay {
	
	private String displayMessage;
	private int displayCount;
	
	public MultiDisplay() {
		displayMessage = "";
		displayCount = 0;
	}
	

	public String getDisplayMessage() {
		return displayMessage;
	}
	
	public int getDisplayCount() {
		return displayCount;
	}
	
	public void setDisplayMessage (String msg) {
		displayMessage = msg;
	}

	public void setDisplayCount (int n) {
		if (n > 0)
			displayCount = n;
		else
			System.err.println("Error! Provide a positive number of counts.");
	}
	
	private void print() {
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}
	
	public void display () {
		print();
	}
	
	public void display (String msg, int n) {
		setDisplayMessage (msg);
		setDisplayCount (n);
		print();
	}

}
