/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class TextAnalyzer {
	private String text;
	
	public TextAnalyzer() {
		text = "";
	}
	
	public TextAnalyzer(String str) {
		text = str;
	}
	
	public void setText(String str) {
		text = str;
	}
	
	
	public int charCount() {
		return text.length();
	}
	
	
	public int upperCaseCount() {
		int count = 0;
		for (int i=0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i)) == true) 
				count ++;
		}
		return count;
	}
	
	
	public int whitespaceCount() {
		int count = 0;
		for (int i=0; i < text.length(); i++) {
			if (Character.isSpaceChar(text.charAt(i)) == true)
				count++;
		}
		return count;
	}
	
	
	public int digitCount() {
		int count = 0;
		for (int i=0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i)) == true)
				count++;
		}
		return count;
	}
	
	
	public boolean containsChar(Character c) {
		boolean containsChar = false;
		for (int i=0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				containsChar = true;
				break;
			}
		}
		return containsChar;
	}
	
	public boolean containsString(String str) {
		boolean containsString = false;
		if (text.indexOf(str) != -1)
			containsString = true;
		return containsString;
	}
	
}
