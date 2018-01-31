/**
 * 
 */
package oc222ba_assign4.newsagency;

import java.util.ArrayList;

/**
 * @author olgachristensen
 * 
 * class for creating a News Agency and handling registration of newspapers and
 * news articles, as well as broadcasting the news to the agency database
 */
public class NewsAgency {
	private String name;						// name of the agency
	private ArrayList <Newspaper> newspapers;	// DB of registered newspapers
	private ArrayList <Article> archive;		// DB of collected  news articles
	
	// constructor for a News Agency object
	public NewsAgency (String str) {
		name = str;
		newspapers = new ArrayList<Newspaper>();
		archive = new ArrayList<Article>();
	}
	
	// returns agency's name
	public String getName () {
		return name;
	}
	
	// method to register a newspaper in the agency DB by its name
	public void registerNewspaper (String str) {
		Newspaper np = new Newspaper(str);
		newspapers.add(np);
		System.out.println("Newspaper registered. Name: " + np.getName() + "; ID: " + np.getID());
	}
	
	/* 
	* method to register a news article in the agency DB
	* the article is then broadcasted to all registered agencies
	* except the one that sent it
	* 
	* @param int npID - ID of the newspaper that registers the article
	* @param String name - name of the article
	* @param String text - text of the article
	*/ 
	public void registerArticle (int npID, String name, String text) {
		Article a = new Article(name, text);
		a.setNewspaperID(npID);
		archive.add(a);
		Newspaper sender = getNewspaperByID(npID);
		sender.setSentArticles(a);
		System.out.println("Newspaper " + sender.getName() + " (ID: " + sender.getID() + ") sent article \"" + a.getArticleName() + "\"");
		
		broadcast(a);
	}
	
	
	// returns an object of class Newspaper from the agency DB by its ID
	public Newspaper getNewspaperByID(int ID) {
		int i = 0;
		for (Newspaper np : newspapers) {
			if (np.getID() == ID)
				i = newspapers.indexOf(np);
		}
		return newspapers.get(i);
	}
	
	
	/*
	 * method sends an article to every newspaper in the agency DB
	 * except the one that sent it
	 */
	public void broadcast(Article a) {
		for (Newspaper np : newspapers) {
			if(a.getNewspaperID() == np.getID()) {
				continue;
			}
			np.setReceivedArticles(a);
			System.out.println("Newspaper " + np.getName() + " received article \"" + a.getArticleName() + "\"");
		}
	}
}

