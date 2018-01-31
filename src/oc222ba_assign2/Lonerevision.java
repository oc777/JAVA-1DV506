/**
 * 
 */
package oc222ba_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class Lonerevision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide salaries (and terminate input with 'X'): ");
		String input = scan.nextLine();
		scan.close();
		//remove X in the end
		String inputInt = input.substring(0, input.length()-1);
		
		//parse string to array list of integers
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		String[] salariesStr = inputInt.split(" "); 
		for (String s : salariesStr) {
			int salary = Integer.parseInt(s);
			salaries.add(salary);
		}
		
		//Sort
		Collections.sort(salaries);
		int l = salaries.size();
		
		//Median: the middle salary (or average of the two middle salaries)
		int median = 0;
		if (l%2 == 1)
			median = salaries.get(l/2);
		else
			median = (salaries.get(l/2) + salaries.get(l/2 - 1))/2;
		
		//Gap: difference between the highest and lowest salaries
		int gap = salaries.get(l - 1) - salaries.get(0);
		
		//Average
		int sum = 0;
		for (int s : salaries)
			sum += s;
		int average = sum / l;
		
		
		System.out.println("Median: " + median);
		System.out.println("Average: " + average);
		System.out.println("Gap: " + gap);
		
	}

}

/*
while (scan.hasNextInt()) { // Do we have any more integers?int num = scan.nextInt();System.out. print (num + ” ”);}
*/
