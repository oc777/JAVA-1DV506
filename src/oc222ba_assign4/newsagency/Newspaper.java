/**
 * 
 */
package oc222ba_assign4.newsagency;

import java.util.ArrayList;

/**
 * @author olgachristensen
 *
 * class for creating a Newspaper 
 * to be stored in News Agency DB
 */
public class Newspaper {
	private String name;							// name of the newspaper
	private static int count = 0;	
	private final int ID;							// ID of the newspaper at the news agency
	private ArrayList<Article> sentArticles;		// list of articles sent to the news agency
	private ArrayList<Article> receivedArticles;	// list of articles received
	
	// constructor for a Newspaper object
	public Newspaper (String str) {
		name = str;
		count++;
		ID = count;
		sentArticles = new ArrayList<Article>();
		receivedArticles = new ArrayList<Article>();
	}
	
	// returns the name of the newspaper
	public String getName() {
		return name;
	}
	
	// returns the ID of the newspaper
	public int getID() {
		return ID;
	}
	
	// adds an object of type Article to the list of sent articles
	public void setSentArticles(Article a) {
		sentArticles.add(a);
		System.out.println("Article sent. Newspaper: " + getName());
	}
	
	// adds an object of type Article to the list of received articles
	public void setReceivedArticles(Article a) {
		receivedArticles.add(a);
		System.out.println("Article received. Newspaper: " + getName());
	}
	
	// returns the list of sent articles
	public ArrayList<Article> getSentArticles() {
		return sentArticles;
	}
	
	// returns the list of received articles
	public ArrayList<Article> getReceivedArticles() {
		return receivedArticles;
	}

}
