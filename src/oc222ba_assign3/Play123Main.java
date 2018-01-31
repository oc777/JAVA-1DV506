/**
 * 
 */
package oc222ba_assign3;

import java.text.DecimalFormat;

/**
 * @author olgachristensen
 *
 */
public class Play123Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] counts = createArray();
			
		int wins = 0;	
		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			
			if(play123(deck, counts))
				wins++;
		}
		
		//System.out.println("Number of wins: " + wins);

		double P = (double) wins/10000*100;
		
		DecimalFormat xx = new DecimalFormat("0.##");
		String probability = xx.format(P);
		
		System.out.println("Probability of winning is approximately " + probability + "%");
		
	}
	
	private static int[] createArray() {
		int[] counting = new int[52];
		
		int i=0;
		while (i < 52) {
			counting[i] = i%3+1;
			i++;
		}
		
		/*
		int[] count = {1,2,3};
		
		int i = 0;
		int times = counting.length/count.length;
		while (i < times*count.length) {
			for (int j = 1; j <= 3; j++) { 
				counting[i] = j;
				i ++;
			}
		} 
		
		int timesMore = counting.length%count.length;
		for (int j=0; j<timesMore; j++) {
			counting[i+j] = count[j];
		}
		*/	
		return counting;
	}
	
	
	private static boolean play123(Deck cards, int[] counts) {
		cards.shuffle();

		boolean win = true;
		
		for (int i = 0; i < 52; i++) {
			Card aCard = cards.draw(i);
			if ( aCard.getRankValue() == counts[i]) {
					win = false;
					break;
			}
		}
		return win;
	}

}

/*
//test createArray()
	for (int i=0; i<counts.length; i++)
		System.out.print(counts[i]);
*/
