/**
 * 
 */
package oc222ba_assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author olgachristensen
 *
 */
public class Deck {
	List<Card> deck;
	Deck() {
		deck = new ArrayList<Card>();
		
		for (Card.Suite suite : Card.Suite.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				deck.add(new Card(rank, suite));
			}
		}
	}
		
	public int size() {
		return deck.size();
	}
		
	//for testing
	public void print() {
		for (Card card : deck) 
			System.out.println(card); 
   }
		
	public void shuffle() {
		if (this.size() == 52)
			Collections.shuffle(deck);
	}
		
	public String deal() {
		Card aCard = deck.get(0);
		deck.remove(0);
		return "Dealing a " + aCard.toString();
	}
	
	public Card draw(int i) {
		return deck.get(i);
	}
}
