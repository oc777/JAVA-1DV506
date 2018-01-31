package oc222ba_assign3;


/**
 * 
 */

/**
 * @author olgachristensen
 *
 */
public class Card {
	public enum Suite { 
		HEARTS, DIMONDS, SPADES, CLUBS 
	}
	
	public enum Rank { 
		TWO(2), THREE(3), FOOR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(1);
		
		private int rankValue;
		
		Rank(int value) {
			this.rankValue = value;
		}
		
		public int getValue() {
			return this.rankValue;
		}
		
	}
	
	final Suite suite;
	final Rank rank;
	
	public Card (Rank rank, Suite suite) {
		this.rank = rank;
		this.suite = suite;
	}
	
	public String toString() {
		return "Card: " + rank + " of " + suite;
	}
	
	public int getRankValue() {
		return this.rank.getValue();
	}
	
}
