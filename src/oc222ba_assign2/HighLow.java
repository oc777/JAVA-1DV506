package oc222ba_assign2;
/**
 * 
 */

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;
import java.util.Random;

public class HighLow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int N = r.nextInt(100) + 1;
		
		int i = 1;
		
		while (i <= 10) {
			System.out.print("Guess! ");
			int guess = scan.nextInt();
			
			if (guess == N) {
				System.out.print("Correct answer after only " + i + " guesses. Excellent!");
				break;
			}
			else if (i == 10)
				System.out.print("You didn't guess the number after 10 tries. Too bad!");
			else if (guess < N) 
				System.out.println("Too low!");
			else //if (guess > N)
				System.out.println("Too high!");
			
			i++;
		}
		
		scan.close();
	}

}
