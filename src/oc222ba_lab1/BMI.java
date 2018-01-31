/**
 * 
 */
package oc222ba_lab1;

/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Your hight in m: ");
		double h = scan.nextDouble();
		
		System.out.print("Your weight in kg: ");
		double w = scan.nextDouble();
		
		double bmiD = w/(h*h);
		int bmiI = (int) Math.round(bmiD);
		
		System.out.print("Your BMI: " + bmiI);
		
		scan.close();

	}

}
