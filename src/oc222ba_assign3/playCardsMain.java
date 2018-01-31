/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class playCardsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		//check the size at the beginning
		System.out.println("Cards in the deck: " + deck.size());
		
		deck.shuffle();
		//test
		//deck.print();
		
		//deal some cards
		System.out.println(deck.deal());
		System.out.println(deck.deal());

		//cards remaining in the deck
		System.out.println("Cards in the deck: " + deck.size());
			
	}

}
