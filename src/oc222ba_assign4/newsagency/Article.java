/**
 * 
 */
package oc222ba_assign4.newsagency;

/**
 * @author olgachristensen
 *
 * class for creating an Article 
 * to be stored in News Agency DB
 */
public class Article {
	private String name;		// title of the article
	private String text;		// content of the article
	private int newspaperID;	// ID of newspaper that created the article
	
	// constructor for an Article object
	public Article (String articleName, String articleText) {
		name = articleName;
		text = articleText;
		newspaperID = 0;
	}
	
	// sets the ID of newspaper that created the article
	public void setNewspaperID(int ID) {
		newspaperID = ID;
	}
	
	// returns the ID of newspaper that created the article
	public int getNewspaperID() {
		return newspaperID;
	}
	
	// returns the title of the article
	public String getArticleName() {
		return name;
	}
	
	// returns the content of the article 
	public String getArticleText() {
		return text;
	}
	
	// returns a print-friendly version of an object Article
	public String toString() {
		String result = "Title: " + getArticleName() + "\n" + getArticleText();
		return result;
	}

}
