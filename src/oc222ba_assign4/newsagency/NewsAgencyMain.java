/**
 * 
 */
package oc222ba_assign4.newsagency;

/**
 * @author olgachristensen
 *
 */
public class NewsAgencyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start a news agency
		NewsAgency r = new NewsAgency("Reuters");
		
		System.out.println("News agency " + r.getName() + " was created.");
		System.out.println("");

		
		// register a newspaper
		r.registerNewspaper("Independent");
		
		// register a newspaper
		r.registerNewspaper("Times");
		
		// register a newspaper
		r.registerNewspaper("Spiegel");
		
		// register a newspaper
		r.registerNewspaper("Dagens Nyheter");
		
		// register a newspaper
		r.registerNewspaper("Telegraph");
		
		// register a newspaper
		r.registerNewspaper("Vesti");
		
		System.out.println("");
		
		// Independent sends an article to Reuters
		r.registerArticle(1, "Monday News", "So many things happened this Monday!");
		
		System.out.println("");
		
		// Spiegel sends an article to Reuters
		r.registerArticle(3, "Friday News", "Friday was awesome!");

		System.out.println("");

		// print out the first article sent by Spiegel
		System.out.println(r.getNewspaperByID(3).getSentArticles().get(0).toString());
		
		System.out.println("");
		
		// print out the first article received by Vesti
		System.out.println(r.getNewspaperByID(6).getReceivedArticles().get(0).toString());
		

	}

}
